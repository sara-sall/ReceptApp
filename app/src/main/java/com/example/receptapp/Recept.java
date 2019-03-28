package com.example.receptapp;

public class Recept {
    String title;
    String description;
    int image;


    public Recept(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getImage(){
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

