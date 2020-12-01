package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface Service {
    List<Order> getOrderList();
    void completeOrder(Order order);
}
