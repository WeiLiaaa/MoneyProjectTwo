package com.liwei.sqlit;

/**
 * Created by wu  suo  wei on 2017/3/27.
 */

public class CartBean {
    private String image;
    private String name;
    private double price;

    public CartBean(String image, String name, double price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public CartBean() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
