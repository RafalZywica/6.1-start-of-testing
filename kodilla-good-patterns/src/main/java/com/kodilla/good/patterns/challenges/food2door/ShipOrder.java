package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class ShipOrder {
    public boolean isDelivered (Producer producer, List<Order> orderList, List<OrderPosition> orderPositionList){
        boolean result = false;
        for(Order order: orderList) {
            for(OrderPosition orderPosition: orderPositionList) {
                if(order.getOrderPosition().equals(orderPosition)) {
                    System.out.println(producer.getNAME() + " shipped " + orderPosition.getQuantity() + " of " + orderPosition.getProduct().getName() + " to " +order.getCustomer().getName() + ".");
                    order.setDelivered(true);
                    result = true;
                }
            }
        }
        return result;
    }
}
