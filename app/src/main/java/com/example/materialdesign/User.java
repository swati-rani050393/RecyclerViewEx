package com.example.materialdesign;

public class User {
    int image;
    String nem;
    String address;

    public User() {
    }

    public User(int image, String nem, String address) {
        this.image = image;
        this.nem = nem;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
