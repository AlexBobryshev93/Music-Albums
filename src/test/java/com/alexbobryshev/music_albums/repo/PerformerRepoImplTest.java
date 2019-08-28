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
        testPerformer = new Performer("testPerformer_AQHGF124");
        assertNotNull(performerRepo.findAll());
        performerRepo.delete(testPerformer.getId());
    }

    @Test
    public void testFindById() {
        testPerformer = new Performer("testPerformer_AQHGF124");
        assertNotNull(performerRepo.findById(0));
        performerRepo.delete(testPerformer.getId());
    }

    @Test
    public void testSaveAndDelete() {
        testPerformer = new Performer("testPerformer_AQHGF124");
        assertNotNull(performerRepo.save(testPerformer));
        performerRepo.delete(testPerformer.getId());
    }
}