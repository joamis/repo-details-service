package com.example.repositoryDetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationSmokeTests {

    @Autowired
    private RepositoryController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
