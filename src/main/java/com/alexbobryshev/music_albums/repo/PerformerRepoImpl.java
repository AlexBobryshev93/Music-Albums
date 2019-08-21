package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class PerformerRepoImpl implements PerformerRepo {
    // wiring with constructor?
    private JdbcTemplate jdbcTemplate;

    @Override
    public Iterable<Performer> findAll() {
        return jdbcTemplate.query("select id, name, genre from Performers",
                this::mapRowToPerformer);
    }

    @Override
    public Performer findById(int id) {
        return jdbcTemplate.queryForObject("select id, name, genre from Performers where id=?",
                this::mapRowToPerformer, id);
    }

    @Override
    public Performer save(Performer performer) {
        jdbcTemplate.update("insert into Performers (id, name, genre) values (?, ?, ?)",
                performer.getId(),
                performer.getName(),
                performer.getGenre().toString());
        return performer;
    }

    public void delete(int id) {
        jdbcTemplate.update("delete * from Performers where id=?", id);
    }

    private Performer mapRowToPerformer(ResultSet rs, int rowNum) throws SQLException {
        return new Performer(
                Integer.valueOf(rs.getString("id")),
                rs.getString("name"),
                Performer.Genre.valueOf(rs.getString("genre")));
    }
}
