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
        testAlbum = new Album(-1, "Ten Thousand Fists", 2005, "Disturbed", Album.Genre.METAL);
        assertNotNull(albumRepo.findAll());
        albumRepo.delete(testAlbum.getId());
    }

    @Test
    public void testFindById() {
        testAlbum = new Album(-1, "Ten Thousand Fists", 2005, "Disturbed", Album.Genre.METAL);
        albumRepo.save(testAlbum);
        assertNotNull(albumRepo.findById(-1));
        albumRepo.delete(testAlbum.getId());
    }

    @Test
    public void testSaveAndDelete() {
        testAlbum = new Album(-1, "Ten Thousand Fists", 2005, "Disturbed", Album.Genre.METAL);
        assertNotNull(albumRepo.save(testAlbum));
        albumRepo.delete(testAlbum.getId());
    }
}