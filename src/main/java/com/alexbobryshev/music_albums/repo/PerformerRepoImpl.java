package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
@AllArgsConstructor
public class PerformerRepoImpl implements PerformerRepo {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Iterable<Performer> findAll() {
        return jdbcTemplate.query("select id, name from performers",
                this::mapRowToPerformer);
    }

    @Override
    public Performer findById(int id) {
        Performer performer;
        try {
            performer = jdbcTemplate.queryForObject("select id, name from performers where id=?",
                    this::mapRowToPerformer, id);
        } catch (EmptyResultDataAccessException e) {
            performer = null;
        }

        return performer;
    }

    @Override
    public Performer save(Performer performer) {
        for(Performer p : findAll()) {
            if (p.getName().trim().toLowerCase().equals(performer.getName().trim().toLowerCase())) {
                return p;
            }
        }

        jdbcTemplate.update("insert into performers (id, name) values (?, ?)",
                performer.getId(),
                performer.getName()
        );
        Performer.setCounter(performer.getId() + 1);
        return performer;
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from performers where id=?", id);
    }

    private Performer mapRowToPerformer(ResultSet rs, int rowNum) throws SQLException {
        return new Performer(
                Integer.valueOf(rs.getString("id")),
                rs.getString("name")
        );
    }
}
