package com.example.repositoryDetails;

public class RepositoryNotFoundException extends RuntimeException {

    RepositoryNotFoundException() {
        super("Could not find the repository");
    }
}
