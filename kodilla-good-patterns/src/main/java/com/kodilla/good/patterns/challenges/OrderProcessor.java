package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private final OrderService orderService;
    private final OrderRepository orderRepository;
    private final MessageProcessor messageProcessor;

    public OrderProcessor(final OrderService orderService, final OrderRepository orderRepository, final MessageProcessor messageProcessor) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.messageProcessor = messageProcessor;
        }


    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.createOrder(order.getCustomer(),order.getProduct(), order.getDeliveryTime());
        if(isOrdered) {
            order.getCustomer().addOrderHistory(order);
            messageProcessor.messageCustomer(order.getCustomer());
            orderRepository.addOrderToRepository(order);
            return new OrderDto(order.getCustomer(), order.getProduct(),true);
        } else {
            return new OrderDto(order.getCustomer(), order.getProduct(),false);
        }
    }
}
