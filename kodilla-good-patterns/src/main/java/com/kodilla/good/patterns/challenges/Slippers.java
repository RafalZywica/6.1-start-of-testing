package com.kodilla.good.patterns.challenges;

public class Slippers implements Product {
    String name;
    int size;
    double price;

    public Slippers(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
