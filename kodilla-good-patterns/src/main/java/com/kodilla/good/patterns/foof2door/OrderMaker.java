package com.kodilla.good.patterns.foof2door;

public class OrderMaker {

    private ProducerList producerList = new ProducerList();
    private ProducersListModerator producersListModerator = new ProducersListModerator();

    public void createOrder() {
        producersListModerator.initializeProducersList(producerList);
        Order order = new Order();
        Producer extraFoodShop = producerList.getProducer("ExtraFoodShop");
        OrderPosition orderPosition1 = new OrderPosition("ExtraFoodShop", extraFoodShop.getProduct("Apple"), 5);
        OrderPosition orderPosition2 = new OrderPosition("ExtraFoodShop", extraFoodShop.getProduct("Orange Juice"), 1);
        order.addOrderPosition(orderPosition1);
        order.addOrderPosition(orderPosition2);
        System.out.println(order);
        for (Producer producer: producerList.getProducersList()) {
            System.out.println(producer);
        }
    }
}
