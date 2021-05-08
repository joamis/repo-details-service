package com.example.repositoryDetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static com.example.repositoryDetails.TestData.MESSAGE_FOR_404_HTTP_RESPONSE;
import static com.example.repositoryDetails.TestData.URI_OF_NONEXISTENT_REPO;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RepositoryController.class)
public class HttpUnsuccessfulRequestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenNonexistentRepositoryURI_whenMockMVC_thenVerifyResponse() throws Exception {
        this.mockMvc.perform(get(URI_OF_NONEXISTENT_REPO))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.message").value(MESSAGE_FOR_404_HTTP_RESPONSE));
    }
}
