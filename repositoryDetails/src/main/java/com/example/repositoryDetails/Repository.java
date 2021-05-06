package com.example.repositoryDetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {

    @JsonProperty("full_name")
    private String fullName;
    private String description;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("stargazers_count")
    private Long stars;
    @JsonProperty("created_at")
    private String createdAt;


    public Repository() {

    }

    public Repository(String fullName, String description, String cloneUrl, Long stars, String createdAt) {
        this.fullName = fullName;
        this.description = description;
        this.cloneUrl = cloneUrl;
        this.stars = stars;
        this.createdAt = createdAt;
    }

    public Repository(String fullName, String cloneUrl, Long stars, String createdAt) {
        this.fullName = fullName;
        this.cloneUrl = cloneUrl;
        this.stars = stars;
        this.createdAt = createdAt;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getStars() {
        return stars;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public void setStars(Long stars) {
        this.stars = stars;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

