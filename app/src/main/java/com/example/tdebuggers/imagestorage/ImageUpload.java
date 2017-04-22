package com.example.tdebuggers.imagestorage;

public class ImageUpload {

    public String name;
    public String url;
    public String price;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getPrice() {
        return price;
    }

    public ImageUpload(String name, String url, String price) {
        this.name = name;
        this.url = url;
        this.price = price;
    }

    public ImageUpload(){}
}
