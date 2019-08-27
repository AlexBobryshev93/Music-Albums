package com.alexbobryshev.music_albums.web;

import com.alexbobryshev.music_albums.model.Album;
import com.alexbobryshev.music_albums.repo.AlbumRepo;
import com.alexbobryshev.music_albums.repo.PerformerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class AlbumsController {
    private PerformerRepo performerRepo;
    private AlbumRepo albumRepo;

    @GetMapping("/add")
    public String addAlbum(Model model) {
        //model.addAttribute("album", new Album());
        model.addAttribute("genres", Album.Genre.values());
        return "add";
    }

    @GetMapping("/list")
    public String albumsList(Model model) {
        model.addAttribute("list", (ArrayList<Album>) albumRepo.findAll());
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

    @PostMapping("new_album")
    public String creation() {
        return "new_album";
    }
}
