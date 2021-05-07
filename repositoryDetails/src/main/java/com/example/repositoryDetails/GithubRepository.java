package com.example.repositoryDetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubRepository {

    @JsonProperty("full_name")
    private String fullName;
    private String description;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("stargazers_count")
    private Long stars;
    @JsonProperty("created_at")
    private String createdAt;

    public GithubRepository() {
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

