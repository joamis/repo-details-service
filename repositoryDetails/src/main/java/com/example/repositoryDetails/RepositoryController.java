package com.example.repositoryDetails;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RepositoryController {

    private static final String GET_REPOSITORY_DETAILS_URL = "https://api.github.com/repos/joamis/JAVA_PROJECT3";

    @GetMapping("/repos/joamis/JAVA_PROJECT3")
    public Repository repository() {
        RestTemplate restTemplate = new RestTemplate();
        Repository repository = restTemplate.getForObject(GET_REPOSITORY_DETAILS_URL, Repository.class);
//        System.out.println("fullName: " + repository.getFullName());
//        System.out.println("name: " + repository.getName());
//        System.out.println("id: " + repository.getId());
//        System.out.println("clone_url: " + repository.getCloneUrl());
//        System.out.println("description: " + repository.getDescription());
//        System.out.println("createdAt: " + repository.getCreatedAt());
//        System.out.println("stars: " + repository.getStars());
//        System.out.println("description " + repository.getDescription());
        return repository;
    }
}
