package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Album;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepoImpl implements AlbumRepo {
    // wiring with constructor?
    private JdbcTemplate jdbcTemplate;

    @Override
    public Iterable<Album> findAll() {
        return null;
    }

    @Override
    public Album findById(int id) {
        return null;
    }

    @Override
    public Album save(Album album) {
        return album;
    }

    @Override
    public void delete(int id) {

    }
}
