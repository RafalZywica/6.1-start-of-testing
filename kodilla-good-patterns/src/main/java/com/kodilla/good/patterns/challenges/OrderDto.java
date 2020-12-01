package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private final Customer customer;
    private final Product product;
    private final boolean isOrdered;

    public OrderDto(Customer customer, Product product, boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
