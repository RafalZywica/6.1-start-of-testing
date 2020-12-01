package com.kodilla.good.patterns.challenges;

public class Product {
    private final String productName;
    private final double price;

    public double getPrice() {
        return price;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }
}
