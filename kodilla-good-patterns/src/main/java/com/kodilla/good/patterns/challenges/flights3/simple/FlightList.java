package com.kodilla.good.patterns.challenges.flights3.simple;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private final List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }
    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "FlightList{" +
                "flightList=" + flightList +
                '}';
    }
}
