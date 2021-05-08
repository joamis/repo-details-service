package com.example.repositoryDetails;

public class TestData {
    public static final String URI_OF_EXISTING_REPO = "/repositories/spring-guides/gs-rest-service";
    public static final String URI_OF_EXISTING_REPO_WITHOUT_DESCRIPTION = "/repositories/joamis/JAVA_PROJECT3";
    public static final String URI_OF_NONEXISTENT_REPO = "/repositories/spring-guides/123";

    public static final String MESSAGE_FOR_404_HTTP_RESPONSE = "Repository does not exist";

    public static final RepositoryDetails existingRepo =
            new RepositoryDetails(
                    "spring-guides/gs-rest-service",
                    "Building a RESTful Web Service :: Learn how to create a RESTful web service with Spring.",
                    "https://github.com/spring-guides/gs-rest-service.git",
                    "2013-04-12T14:54:36Z"
            );

    public static final RepositoryDetails existingRepoWithoutDescription =
            new RepositoryDetails(
                    "joamis/JAVA_PROJECT3",
                    "https://github.com/joamis/JAVA_PROJECT3.git",
                    "2021-05-05T20:41:38Z"
            );
}
