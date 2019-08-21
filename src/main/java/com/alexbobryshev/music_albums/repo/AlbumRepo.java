package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Album;

public interface AlbumRepo {
    Iterable<Album> findAll();
    Album findById(int id);
    Album save(Album album);
    void delete(int id);
}
