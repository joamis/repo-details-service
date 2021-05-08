package com.example.repositoryDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RepositoryController {
    private static final String REPOSITORY_DETAILS_URL = "https://api.github.com/repos/";
    @Autowired
    private RestTemplate restTemplateWithErrorHandler;

    @GetMapping("/repositories/{owner}/{repository-name}")
    public RepositoryDetails getRepositoryDetails(@PathVariable("owner") String ownerName, @PathVariable("repository-name") String repositoryName) {
        String url = REPOSITORY_DETAILS_URL + ownerName + '/' + repositoryName;
        GithubRepository githubRepository = restTemplateWithErrorHandler.getForObject(url, GithubRepository.class);
        return new RepositoryDetails(githubRepository.getFullName(), githubRepository.getDescription(), githubRepository.getCloneUrl(), githubRepository.getStars(), githubRepository.getCreatedAt());
    }
}
