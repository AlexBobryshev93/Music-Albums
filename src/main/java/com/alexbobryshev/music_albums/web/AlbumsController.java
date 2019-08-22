package com.alexbobryshev.music_albums.web;

import com.alexbobryshev.music_albums.repo.PerformerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class AlbumsController {
    private PerformerRepo performerRepo;

    @GetMapping
    public String showGreetingsPage() {
        performerRepo.findAll().forEach(System.out::println);
        return "home";
    }
}
