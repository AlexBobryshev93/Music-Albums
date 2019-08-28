package com.alexbobryshev.music_albums.repo;

import com.alexbobryshev.music_albums.model.Performer;
import org.junit.Ignore;
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
        testPerformer = new Performer(-1, "testPerformer_AQHGF124");
        performerRepo.save(testPerformer);
        assertNotNull(performerRepo.findAll());
        performerRepo.delete(testPerformer.getId());
    }

    @Test
    public void testFindById() {
        testPerformer = new Performer(-1, "testPerformer_AQHGF124");
        performerRepo.save(testPerformer);
        assertNotNull(performerRepo.findById(testPerformer.getId()));
        performerRepo.delete(testPerformer.getId());
    }

    @Test
    @Ignore("testSaveAndDelete() was ignored because of testing in other testing methods")
    public void testSaveAndDelete() {
        testPerformer = new Performer(-1, "testPerformer_AQHGF124");
        assertNotNull(performerRepo.save(testPerformer));
        performerRepo.delete(testPerformer.getId());
    }
}