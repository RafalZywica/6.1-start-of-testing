package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private final Customer customer;
    private final OrderPosition orderPosition;
    private boolean delivered;
    private final double orderPrice;
    private final Producer producer;

    public Order(Producer producer, Customer customer, OrderPosition orderPosition, boolean delivered) {
        this.producer = producer;
        this.customer = customer;
        this.orderPosition = orderPosition;
        this.delivered = delivered;
        orderPrice = orderPosition.getQuantity() * orderPosition.getProduct().getPrice();
    }

    public Producer getProducer() {
        return producer;
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

    @Override
    public String toString() {
        return "Order{" +
                "producer" + producer +
                "customer=" + customer +
                ", orderPosition=" + orderPosition +
                ", delivered=" + delivered +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
