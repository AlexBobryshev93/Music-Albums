package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PerformerRepoImplTest {
    @Autowired
    private PerformerRepo performerRepo;

    private Performer testPerformer;

    @Test
    public void testFindAll() {
        assertNotNull(performerRepo.findAll());
    }

    @Test
    public void testFindById() {
        assertNotNull(performerRepo.findById(0));
    }

    @Test
    public void testSaveAndDelete() {
        testPerformer = new Performer("Pink Floyd");
        assertNotNull(performerRepo.save(testPerformer));
        performerRepo.delete(testPerformer.getId());
    }
}