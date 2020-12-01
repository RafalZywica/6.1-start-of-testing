package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Example {

    public Order retrieve() {

        Customer exampleCustomer = new Customer("Władzio", "Kałamaga");
        Product exampleProduct = new Product("Computer mouse", 100);
        LocalDateTime exampleDeliveryTime = LocalDateTime.of(2020, 12, 3, 10, 0, 0);

        return new Order(exampleCustomer, exampleProduct, exampleDeliveryTime);
    }
}
