package com.kodilla.good.patterns.challenges;

public class ToothBrush implements Product {
    String name;
    String colour;
    double price;

    public ToothBrush(String name, String colour, double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + colour + price;
    }
}
