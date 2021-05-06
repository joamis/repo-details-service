package com.example.repositoryDetails;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RepositoryDetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositoryDetailsApplication.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run() {
//        return args -> {
////            RestTemplate restTemplate = new RestTemplate();
////            Repository repository = restTemplate.getForObject(GET_REPOSITORY_DETAILS_URL, Repository.class);
////            System.out.println("fullName: " + repository.getFullName());
////            System.out.println("name: " + repository.getName());
////            System.out.println("id: " + repository.getId());
////            System.out.println("clone_url: " + repository.getCloneUrl());
////            System.out.println("description: " + repository.getDescription());
////            System.out.println("createdAt: " + repository.getCreatedAt());
////            System.out.println("stars: " + repository.getStars());
////            System.out.println("description " + repository.getDescription());
////			System.out.println("stars:    " + repository.getStars());
////			System.out.println("createdAt:    " + repository.getCreatedAt());
////			System.out.println("Description   :    " + repository.getDescription());
////			System.out.println("CloneUrl :    " + repository.getCloneUrl());
//        };
//    }
}
