package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class OrderPosition {
    private Product product;
    private int quantity;

    public OrderPosition(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPosition that = (OrderPosition) o;
        return quantity == that.quantity &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }

    @Override
    public String toString() {
        return "OrderPosition{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
