package com.alexbobryshev.music_albums.web;

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

    @GetMapping("/add")
    public String addAlbum() {
        return "add";
    }

    @GetMapping("/list")
    public String albumsList() {
        performerRepo.findAll().forEach(System.out::println);
        return "list";
    }

    @GetMapping("/edit")
    public String editAlbum() {
        performerRepo.findAll().forEach(System.out::println);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteAlbum() {
        performerRepo.findAll().forEach(System.out::println);
        return "list";
    }
}
