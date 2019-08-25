package com.alexbobryshev.music_albums.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Performer {
    private static int counter;
    private int id;
    private String name;

    public Performer(String name) {
        this.id = ++counter;
        this.name = name;
    }
}
