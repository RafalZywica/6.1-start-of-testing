package com.kodilla.good.patterns.challenges;

public class Game implements Product {
    String name;
    double price;

    public Game(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
