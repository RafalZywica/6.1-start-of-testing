package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryGaming implements OrderRepository {

    private static final List<Order> orderRepository = new ArrayList<>();

    @Override
    public void addOrderToRepository(Order order) {
        orderRepository.add(order);
        System.out.println("The order has been added to the gaming category");
    }
}
