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

    public Album(String name, int year, String performerName) {
        this.id = ++counter;
        this.name = name;
        this.year = year;
        this.performer = new Performer(performerName);
    }
}
