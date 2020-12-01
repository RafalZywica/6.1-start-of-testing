package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class ShipOrder {
    public boolean isDelivered (String name, Service service, List<OrderPosition> orderPositionList){
        boolean result = false;
        for(Order order: service.getOrderList()) {
            for(OrderPosition orderPosition: orderPositionList) {
                if(order.getOrderPosition().equals(orderPosition)) {
                    System.out.println(name + " shipped " + orderPosition.getQuantity() + " of " + orderPosition.getProduct().getName() + " to " +order.getCustomer().getName() + ".");
                    order.setDelivered(true);
                    result = true;
                }
            }
        }
        return result;
    }
}
