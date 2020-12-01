package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderServicePaymentOnline implements OrderService {
    @Override
    public  boolean createOrder(Customer customer, Product product, LocalDateTime deliveryTime) {
        System.out.println(product.getProductName() + "\ncustomer: " + customer.getName() + " " + customer.getSurname()
        + "\ndelivery time: " + deliveryTime + " "+ product.getPrice() + "$ paid online");
        return true;
    }
}
