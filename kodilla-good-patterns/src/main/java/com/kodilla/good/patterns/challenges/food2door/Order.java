package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private final Customer customer;
    private final OrderPosition orderPosition;
    private boolean delivered;
    private final double orderPrice;

    public Order(Customer customer, OrderPosition orderPosition, boolean delivered) {
        this.customer = customer;
        this.orderPosition = orderPosition;
        this.delivered = delivered;
        orderPrice = orderPosition.getQuantity() * orderPosition.getProduct().getPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public OrderPosition getOrderPosition() {
        return orderPosition;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
