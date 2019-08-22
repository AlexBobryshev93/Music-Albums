package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;

public interface PerformerRepo {
    Iterable<Performer> findAll();
    Performer findById(int id);
    Performer save(Performer performer);
    int delete(int id);
}
