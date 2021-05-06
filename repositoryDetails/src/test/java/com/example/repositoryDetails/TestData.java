package com.example.repositoryDetails;

public class TestData {
    public static final String URI_OF_EXISTING_REPO = "/repositories/spring-guides/gs-rest-service";
    public static final String URI_OF_EXISTING_REPO_WITHOUT_DESCRIPTION = "/repositories/joamis/JAVA_PROJECT3";
    public static final String URI_OF_NONEXISTENT_REPO = "/repositories/spring-guides/123";

    public static final Repository existingRepo =
            new Repository(
                    "spring-guides/gs-rest-service",
                    "Building a RESTful Web Service :: Learn how to create a RESTful web service with Spring.",
                    "https://github.com/spring-guides/gs-rest-service.git",
                    1025L,
                    "2013-04-12T14:54:36Z"
            );

    public static final Repository existingRepoWithoutDescription =
            new Repository(
                    "joamis/JAVA_PROJECT3",
                    "https://github.com/joamis/JAVA_PROJECT3.git",
                    0L,
                    "2021-05-05T20:41:38Z"
            );
}
