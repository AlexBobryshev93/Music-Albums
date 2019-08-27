package com.alexbobryshev.music_albums.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Album {
    private static int counter;
    private int id;
    private String name;
    private int year;
    private Performer performer;
    private Genre genre;

    public enum Genre {
        ROCK, METAL, CHANSON, POP, JAZZ, HIP_HOP, OTHER
    }

    public Album() {
        this.id = ++counter;
    }

    public Album(String name, int year, String performerName, Genre genre) {
        this.id = ++counter;
        this.name = name;
        this.year = year;
        this.performer = new Performer(performerName);
        this.genre = genre;
    }

    public Album(int id, String name, int year, String performerName, Genre genre) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.performer = new Performer(performerName);
        this.genre = genre;
    }
}
