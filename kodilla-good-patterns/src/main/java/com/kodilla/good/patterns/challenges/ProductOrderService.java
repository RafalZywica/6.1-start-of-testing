package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        Example example = new Example();
        Order order = example.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderServicePaymentOnline(), new OrderRepositoryGaming(), new MessageService());
        OrderDto orderDto = orderProcessor.process(order);

        if (orderDto.isOrdered()) {
            System.out.println(orderDto.getProduct().getProductName() + " has been ordered by " + orderDto.getCustomer().getName() + ".");
        } else {
            System.out.println("The order can't be completed");
        }
    }
}
