package com.example.repositoryDetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {
    private String name;
    private String id;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("stargazers_count")
    private String stars;
    @JsonProperty("created_at")
    private String createdAt;
    private String description;

    public Repository() {

    }

    public String getFullName() {
        return fullName;
    }

    public String getStars() {
        return stars;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getId() {
        return id;
    }

}

