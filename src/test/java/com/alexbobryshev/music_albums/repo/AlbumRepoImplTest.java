package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Album;
import org.junit.Ignore;
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
        testAlbum = new Album(-1, "testAlbum_FGTdsysDRGT845", 2019, "testPerformer_FGTdGT845", Album.Genre.OTHER);
        albumRepo.save(testAlbum);
        assertNotNull(albumRepo.findAll());
        albumRepo.delete(testAlbum.getId());
    }

    @Test
    public void testFindById() {
        testAlbum = new Album(-1, "testAlbum_FGTdsysDRGT845", 2019, "testPerformer_FGTdGT845", Album.Genre.OTHER);
        albumRepo.save(testAlbum);
        assertNotNull(albumRepo.findById(testAlbum.getId()));
        albumRepo.delete(testAlbum.getId());
    }

    @Test
    @Ignore("testSaveAndDelete() was ignored because of testing in other testing methods")
    public void testSaveAndDelete() {
        testAlbum = new Album(-1, "testAlbum_FGTdsysDRGT845", 2019, "testPerformer_FGTdGT845", Album.Genre.OTHER);
        assertNotNull(albumRepo.save(testAlbum));
        albumRepo.delete(testAlbum.getId());
    }
}