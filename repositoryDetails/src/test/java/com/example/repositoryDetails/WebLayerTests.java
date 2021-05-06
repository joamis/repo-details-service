package com.example.repositoryDetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static com.example.repositoryDetails.TestData.EXAMPLE_URL;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RepositoryController.class)
public class WebLayerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenRepositoryURI_whenMockMVC_thenVerifyResponse() throws Exception {
        this.mockMvc.perform(get(EXAMPLE_URL))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.full_name").value("spring-guides/gs-rest-service"))
                .andExpect(jsonPath("$.description").value("Building a RESTful Web Service :: Learn how to create a RESTful web service with Spring."))
                .andExpect(jsonPath("$.clone_url").value("https://github.com/spring-guides/gs-rest-service.git"))
                .andExpect(jsonPath("$.stargazers_count").value(1025))
                .andExpect(jsonPath("$.created_at").value("2013-04-12T14:54:36Z"));
    }
}
