package com.kodilla.good.patterns.challenges.food2door;

public class Customer {

    private final String name;
    private final String town;
    private final String address;
    private final String postCode;

    public Customer(String name, String town, String address, String postCode) {
        this.name = name;
        this.town = town;
        this.address = address;
        this.postCode = postCode;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }
}
