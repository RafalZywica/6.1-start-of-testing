package com.kodilla.good.patterns.challenges.flights2;

public class Airport {
    private String city;
    private String name;

    public Airport(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "city='" + city +
                " " + name + '\'' +
                '}';
    }
}
