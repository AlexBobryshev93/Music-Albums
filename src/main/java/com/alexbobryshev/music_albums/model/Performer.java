package com.alexbobryshev.music_albums.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Performer {
    private static int counter;
    private int id;
    private String name;
    private Genre genre;

    public enum Genre {
        ROCK, METAL, CHANSON, POP, JAZZ, HIP_HOP
    }

    public Performer(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public Performer(String name, Genre genre) {
        this.id = ++counter;
        this.name = name;
        this.genre = genre;
    }
}
