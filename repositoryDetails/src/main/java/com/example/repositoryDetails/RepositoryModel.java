package com.example.repositoryDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoryModel {

    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("cloneUrl")
    private String cloneUrl;
    @JsonProperty("stars")
    private Long stars;
    @JsonProperty("createdAt")
    private String createdAt;


    public RepositoryModel(String fullName, String description, String cloneUrl, String createdAt) {
        this.fullName = fullName;
        this.description = description;
        this.cloneUrl = cloneUrl;
        this.createdAt = createdAt;
    }

    public RepositoryModel(String fullName, String cloneUrl, String createdAt) {
        this.fullName = fullName;
        this.cloneUrl = cloneUrl;
        this.createdAt = createdAt;
    }

    public RepositoryModel(String fullName, String description, String cloneUrl, Long stars, String createdAt) {
        this.fullName = fullName;
        this.description = description;
        this.cloneUrl = cloneUrl;
        this.stars = stars;
        this.createdAt = createdAt;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public Long getStars() {
        return stars;
    }

    public String getCreatedAt() {
        return createdAt;
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
