package com.kodilla.good.patterns.challenges.food2door.producers;

import com.kodilla.good.patterns.challenges.food2door.OrderPosition;
import com.kodilla.good.patterns.challenges.food2door.Producer;
import com.kodilla.good.patterns.challenges.food2door.Service;
import com.kodilla.good.patterns.challenges.food2door.ShipOrder;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producer {
    private static final String NAME = "HealthyShop";
    private List<OrderPosition> orderPositionList = new ArrayList<>();

    public void addOrderPosition(OrderPosition orderPosition) {
        orderPositionList.add(orderPosition);
    }

    @Override
    public boolean process(Service service) {
        ShipOrder shipOrder = new ShipOrder();
        return shipOrder.isDelivered(NAME, service, orderPositionList);
    }

    @Override
    public List<OrderPosition> getOrderPositionList() {
        return orderPositionList;
    }
}
