package com.alexbobryshev.music_albums.repo;

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

    @Test
    public void testFindAll() {
        assertNotNull(performerRepo.findAll());
    }

    @Test
    public void findById() {
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}