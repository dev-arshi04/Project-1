package com.example.akshuuproject;

public class Hotel {
    String name, price;
    int image;

    public Hotel(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public int getImage() { return image; }
}
