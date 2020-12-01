package com.kodilla.good.patterns.challenges.flights;

import java.util.Arrays;

public class ExampleFlights {
    private FlightList flightList;

    public void generateExampleFlightlist() {
        Flight flight1 = new Flight(1, Arrays.asList("New York", "Paris", "Moscow"));
        Flight flight2 = new Flight(2, Arrays.asList("Tokyo", "Moscow", "Warsaw", "Paris"));
        Flight flight3 = new Flight(3, Arrays.asList("London", "Washington"));
        Flight flight4 = new Flight(4, Arrays.asList("Warsaw", "Baghdad", "Delhi"));
        Flight flight5 = new Flight(5, Arrays.asList("Warsaw", "Cairo", "Cape Town"));
        Flight flight6 = new Flight(6, Arrays.asList("York", "Frankfurt", "Napoli"));
        Flight flight7 = new Flight(7, Arrays.asList("Warsaw", "Luksemburg"));
        Flight flight8 = new Flight(8, Arrays.asList("Berlin", "Kiev", "Moscow", "Beijing"));

        flightList = new FlightList();
        flightList.addFlight(flight1);
        flightList.addFlight(flight2);
        flightList.addFlight(flight3);
        flightList.addFlight(flight4);
        flightList.addFlight(flight5);
        flightList.addFlight(flight6);
        flightList.addFlight(flight7);
        flightList.addFlight(flight8);
    }

    public FlightList getFlightList() {
        return flightList;
    }
}
