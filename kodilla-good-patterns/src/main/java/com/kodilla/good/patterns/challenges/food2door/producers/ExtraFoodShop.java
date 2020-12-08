package com.kodilla.good.patterns.challenges.food2door.producers;

import com.kodilla.good.patterns.challenges.food2door.*;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producer {
    private static final String NAME = "ExtraFoodShop";
    private List<OrderPosition> orderPositionList = new ArrayList<>();

    public void addOrderPosition(OrderPosition orderPosition) {
        orderPositionList.add(orderPosition);
    }

    public String getNAME() {
        return NAME;
    }

    /*@Override
    public boolean process(Service service) {
        ShipOrder shipOrder = new ShipOrder();
        return shipOrder.isDelivered(getNAME(), service, orderPositionList);
    }*/

    @Override
    public List<OrderPosition> getOrderPositionList() {
        return orderPositionList;
    }
}
