package com.example.repositoryDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RepositoryController {

    private static final String GET_REPOSITORY_DETAILS_URL = "https://api.github.com/repos/";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/repositories/{owner}/{repository-name}")
    public Repository getRepositoryDetails(@PathVariable("owner") String ownerName, @PathVariable("repository-name") String repositoryName) {
        String url = GET_REPOSITORY_DETAILS_URL + ownerName + '/' + repositoryName;
        return restTemplate.getForObject(url, Repository.class);
    }
}
