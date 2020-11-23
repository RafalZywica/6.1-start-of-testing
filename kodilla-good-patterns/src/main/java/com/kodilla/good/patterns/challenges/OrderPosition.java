package com.kodilla.good.patterns.challenges;

public class OrderPosition {
    Product product;
    int count;

    public OrderPosition(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
