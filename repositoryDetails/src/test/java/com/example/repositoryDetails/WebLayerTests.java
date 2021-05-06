package com.example.repositoryDetails;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.stream.Stream;

import static com.example.repositoryDetails.TestData.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RepositoryController.class)
public class WebLayerTests {

    @Autowired
    private MockMvc mockMvc;

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void givenRepositoryURI_whenMockMVC_thenVerifyResponse(String uri, Repository repository) throws Exception {
        this.mockMvc.perform(get(uri))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.full_name").value(repository.getFullName()))
                .andExpect(jsonPath("$.description").value(repository.getDescription()))
                .andExpect(jsonPath("$.clone_url").value(repository.getCloneUrl()))
                .andExpect(jsonPath("$.stargazers_count").value(repository.getStars()))
                .andExpect(jsonPath("$.created_at").value(repository.getCreatedAt()));
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(URI_OF_EXISTING_REPO, existingRepo),
                Arguments.of(URI_OF_EXISTING_REPO_WITHOUT_DESCRIPTION, existingRepoWithoutDescription)
        );
    }
}
