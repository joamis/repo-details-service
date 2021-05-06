package com.example.repositoryDetails;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RepositoryController {

    private static final String GET_REPOSITORY_DETAILS_URL = "https://api.github.com/repos/";

    @GetMapping("/repositories/{owner}/{repository-name}")
    public Repository repository(@PathVariable("owner") String ownerName, @PathVariable("repository-name") String repositoryName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = GET_REPOSITORY_DETAILS_URL + ownerName + '/' + repositoryName;
        return restTemplate.getForObject(url, Repository.class);
    }
}
