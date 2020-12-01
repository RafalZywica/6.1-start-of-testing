package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean createOrder(Customer customer, Product product, LocalDateTime deliveryTime);
}
