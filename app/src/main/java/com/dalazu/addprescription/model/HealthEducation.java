package com.dalazu.addprescription.model;

public class HealthEducation {

    private String title;
    private String imgUrl;
    private String description;

    public HealthEducation(String title, String imgUrl, String description) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
