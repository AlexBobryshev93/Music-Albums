package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AlbumRepoImplTest {
    @Autowired
    private AlbumRepo albumRepo;

    private Album testAlbum;

    @Test
    public void testFindAll() {
        assertNotNull(albumRepo.findAll());
    }

    @Test
    public void testFindById() {
        assertNotNull(albumRepo.findById(0));
    }

    @Test
    public void testSaveAndDelete() {
        testAlbum = new Album("Ten Thousand Fists", 2005, "Disturbed", Album.Genre.METAL);
        assertNotNull(albumRepo.save(testAlbum));
        albumRepo.delete(testAlbum.getId());
    }
}