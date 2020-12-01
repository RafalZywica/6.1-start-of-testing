package com.kodilla.good.patterns.foof2door;

public class OrderPosition {
    private String producerName;
    private Product product;
    private int quantity;

    public OrderPosition(String producer, Product product, int quantity) {
        this.producerName = producer;
        this.product = product;
        this.quantity = quantity;
    }

    public String getProducer() {
        return producerName;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderPosition{" +
                "producerName='" + producerName + '\'' +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
