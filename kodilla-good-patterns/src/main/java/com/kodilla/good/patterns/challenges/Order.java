package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private final List<OrderPosition> order = new ArrayList<>();


    private final Date orderCreationDate = new Date(System.currentTimeMillis());

    public void addPositionToOrder(OrderPosition orderPosition) {
        order.add(orderPosition);
    }

    public Date getOrderCreationDate() {
        return orderCreationDate;
    }

    public List<OrderPosition> getOrder() {
        return order;
    }
}
