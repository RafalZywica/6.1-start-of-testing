package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface Producer {
    /*boolean process(Service service);*/
    List<OrderPosition> getOrderPositionList();
    void addOrderPosition(OrderPosition orderPosition);

    String getNAME();
}
