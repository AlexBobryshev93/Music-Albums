package com.alexbobryshev.music_albums.web;

import com.alexbobryshev.music_albums.model.Album;
import com.alexbobryshev.music_albums.repo.AlbumRepo;
import com.alexbobryshev.music_albums.repo.PerformerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

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

    @GetMapping("/edit/{id}")
    public String editAlbum(@PathVariable String id, Model model) {
        model.addAttribute("genres", Album.Genre.values());
        model.addAttribute("album", albumRepo.findById(Integer.valueOf(id)));
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteAlbum(@PathVariable String id) {
        albumRepo.delete(Integer.valueOf(id));
        return "list";
    }

    @PostMapping("save_album")
    public String creation() {
        return "save_album";
    }
}
