package com.example.recycleradapter;

public class Model {

    private Integer  image;
    private String  describtion;

    public Model(Integer image, String describtion) {
        this.image = image;
        this.describtion = describtion;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
}
