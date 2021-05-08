package com.example.repositoryDetails;

import com.example.repositoryDetails.exception.RestTemplateErrorHandler;
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

    @Bean
    RestTemplate restTemplateWithErrorHandler() {
        return new RestTemplateBuilder()
                .errorHandler(new RestTemplateErrorHandler())
                .build();
    }
}
