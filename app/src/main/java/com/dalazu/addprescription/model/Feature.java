package com.dalazu.addprescription.model;

public class Feature {

    private int icon;

    private String title;


    public Feature(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }


    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
