package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;
import org.junit.AfterClass;
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
        assertNotNull(performerRepo.findById(1));
    }

    @Test
    public void testSave() {
        testPerformer = new Performer("Pink Floyd", Performer.Genre.ROCK);
        testPerformer.setId(0);
        assertNotNull(performerRepo.save(testPerformer));
        performerRepo.delete(testPerformer.getId());
    }

    @Test
    public void testDelete() {
        assertEquals(1, performerRepo.delete(1));
    }
}