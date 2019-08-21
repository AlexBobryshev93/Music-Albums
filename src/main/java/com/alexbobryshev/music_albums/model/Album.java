package com.alexbobryshev.music_albums.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Album {
    private int id;
    private String name;
    private int year;
    private Performer performer;
}
