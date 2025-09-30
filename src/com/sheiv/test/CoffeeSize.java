package com.sheiv.test;

public enum CoffeeSize {

    SMALL ("small", 3),
    MEDIUM ("medium", 5),
    LARGE ("large", 7);

    private String name;
    private int price;

    CoffeeSize(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
