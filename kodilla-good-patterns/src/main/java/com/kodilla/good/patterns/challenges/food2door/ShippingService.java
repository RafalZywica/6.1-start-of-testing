package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ShippingService implements Service {

    private final List<Order> orderList = new ArrayList<>();

    public void addNewOrder(Producer producer, Customer customer, OrderPosition orderPosition) {
        /*orderPosition.getProducer().addOrderPosition(orderPosition);*/
        Order order = new Order(producer, customer, orderPosition, false);
        orderList.add(order);
    }

    public List<Order> getOrderListOfProducer(Producer producer) {
        List<Order> orderListOfProducer = new ArrayList<>();
        for (Order order: orderList){
            if (order.getProducer() == producer){
                orderListOfProducer.add(order);
            }
        } return orderListOfProducer;
    }

    public boolean process(Producer producer) {
        ShipOrder shipOrder = new ShipOrder();
        return shipOrder.isDelivered(producer, orderList, producer.getOrderPositionList());
    }

    @Override
    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public void completeOrder(Order order) {
        for (Order order1: orderList) {
            if(order1.equals(order)) {
                order.setDelivered((true));
            }
        }
    }

    public List<Order> getActiveOrders() {
        List<Order> orderList = new ArrayList<>();
        this.orderList.stream()
                .filter(order -> !order.isDelivered())
                .forEach(orderList::add);
        return orderList;
    }
}
