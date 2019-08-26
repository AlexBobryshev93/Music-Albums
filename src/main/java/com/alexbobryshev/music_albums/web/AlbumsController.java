package com.alexbobryshev.music_albums.web;

import com.alexbobryshev.music_albums.repo.AlbumRepo;
import com.alexbobryshev.music_albums.repo.PerformerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@AllArgsConstructor
public class AlbumsController {
    private PerformerRepo performerRepo;
    private AlbumRepo albumRepo;

    @GetMapping("/add")
    public String addAlbum() {
        return "add";
    }

    @GetMapping("/list")
    public String albumsList() {
        //albumRepo.findAll().forEach(System.out::println);
        return "list";
    }

    @GetMapping("/edit")
    public String editAlbum() {
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteAlbum() {
        return "list";
    }
}
