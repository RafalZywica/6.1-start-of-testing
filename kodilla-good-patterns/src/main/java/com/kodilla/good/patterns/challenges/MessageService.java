package com.kodilla.good.patterns.challenges;

public class MessageService implements MessageProcessor {
    @Override
    public void messageCustomer(Customer customer) {
        System.out.println("Customer " + customer.getName() + " " + customer.getSurname() + ", was messaged.");
    }
}
