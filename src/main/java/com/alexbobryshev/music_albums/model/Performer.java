package com.alexbobryshev.music_albums.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Performer {
    private int id;
    private String name;
    private Genre genre;

    public enum Genre {
        ROCK, METAL, CHANSON, POP, JAZZ, HIP_HOP
    }
}
