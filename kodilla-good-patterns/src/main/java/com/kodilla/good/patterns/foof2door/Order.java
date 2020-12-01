package com.kodilla.good.patterns.foof2door;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderPosition> orderPositionsList = new ArrayList<>();
    private double orderWorth;
    private String orderListString = "";

    public void addOrderPosition(OrderPosition orderPosition) {
        orderPositionsList.add(orderPosition);
        orderWorth = 0;
        for (OrderPosition orderPosition1 : orderPositionsList) {
            orderWorth += orderPosition1.getQuantity() * orderPosition1.getProduct().getPrice();
        }
        for (OrderPosition oP: orderPositionsList) {
            orderListString += oP.getProduct().getName() + " " + oP.getProduct().getPrice() + ", " ;
        }
        for (OrderPosition oP1: orderPositionsList) {
            System.out.println(oP1);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderPositionsList=" + orderListString +
                ", orderWorth=" + orderWorth +
                '}';
    }
}