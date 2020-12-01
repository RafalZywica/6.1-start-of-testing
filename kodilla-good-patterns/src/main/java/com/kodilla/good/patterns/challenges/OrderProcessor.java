package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;
    private MessageProcessor messageProcessor;

    public OrderProcessor(ProductOrderService productOrderService, OrderRepository orderRepository, MessageProcessor messageProcessor) {
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
        this.messageProcessor = messageProcessor;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = ProductOrderService.order(order.getCustomer(), order.getDeliveryTime());
        if(isOrdered) {
            MessageProcessor.messageCustomer();
            OrderRepository.createOrder(order.getCustomer(), order.getDeliveryTime());
            return new OrderDto(order.getCustomer(), true);
        } else {
            return new OrderDto(order.getCustomer(), false);
        }
    }
}
