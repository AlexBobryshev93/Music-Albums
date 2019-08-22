package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
        return jdbcTemplate.query("select id, name, genre from performers",
                this::mapRowToPerformer);
    }

    @Override
    public Performer findById(int id) {
        return jdbcTemplate.queryForObject("select id, name, genre from performers where id=?",
                this::mapRowToPerformer, id);
    }

    @Override
    public Performer save(Performer performer) {
        jdbcTemplate.update("insert into performers (id, name, genre) values (?, ?, ?)",
                performer.getId(),
                performer.getName(),
                performer.getGenre().toString());
        return performer;
    }

    @Override
    public int delete(int id) {
        jdbcTemplate.update("delete from performers where id=?", id);
        return id;
    }

    private Performer mapRowToPerformer(ResultSet rs, int rowNum) throws SQLException {
        return new Performer(
                Integer.valueOf(rs.getString("id")),
                rs.getString("name"),
                Performer.Genre.valueOf(rs.getString("genre")));
    }
}
