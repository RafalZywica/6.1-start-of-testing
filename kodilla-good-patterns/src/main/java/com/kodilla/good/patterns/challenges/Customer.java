package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String surname;
    private final List<Order> orderHistory = new ArrayList<>();

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addOrderHistory(Order order) {
        orderHistory.add(order);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
