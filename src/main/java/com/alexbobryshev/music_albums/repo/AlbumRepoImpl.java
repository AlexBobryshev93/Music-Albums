package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AlbumRepoImpl implements AlbumRepo {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Iterable<Album> findAll() {
        return jdbcTemplate.query("select id, name, year, performer, genre from albums",
                this::mapRowToAlbum);
    }

    @Override
    public Album findById(int id) {
        Album album;
        try {
            album = jdbcTemplate.queryForObject("select id, name, year, performer, genre from albums where id=?",
                    this::mapRowToAlbum, id);
        } catch (EmptyResultDataAccessException e) {
            album = null;
        }

        return album;
    }

    @Override
    public Album save(Album album) {
        jdbcTemplate.update("insert into albums (id, name, year, performer, genre) values (?, ?, ?, ?, ?)",
                album.getId(),
                album.getName(),
                album.getYear(),
                album.getPerformer().getName(),
                album.getGenre().toString()
        );
        return album;
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from albums where id=?", id);
    }

    private Album mapRowToAlbum(ResultSet rs, int rowNum) throws SQLException {
        return new Album(
                Integer.valueOf(rs.getString("id")),
                rs.getString("name"),
                Integer.valueOf(rs.getString("year")),
                rs.getString("performer"),
                Album.Genre.valueOf(rs.getString("genre")));
    }
}
