package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRetriever {
    public Order retrieve() {
        Customer customer = new Customer("Alfred", "Barbakan");
        Product product = new Product("wheel", 20);
        LocalDateTime deliveryTime = LocalDateTime.of(2020, 12, 3, 10, 0);

        return new Order(customer, product, deliveryTime);
    }
}
