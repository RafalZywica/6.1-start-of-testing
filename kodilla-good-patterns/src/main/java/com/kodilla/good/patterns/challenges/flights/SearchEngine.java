package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {

    public List<Flight> searchByDeparture(FlightList flightList, String departure) {
        return flightList.getFlightList().stream()
                .filter(c -> departure.equals(c.getFlightPoints().get(0)))
                .collect(Collectors.toList());
    }
    public List<Flight> searchByTransition(FlightList flightList, String transition) {
        return flightList.getFlightList().stream()
                .filter(c -> !transition.equals(c.getFlightPoints().get(0)))
                .filter(c -> !transition.equals(c.getFlightPoints().get(c.getFlightPoints().size()-1)))
                .filter(c -> c.getFlightPoints().contains(transition))
                .collect(Collectors.toList());
    }
    public List<Flight> searchByArrival(FlightList flightList, String arrival) {
        return flightList.getFlightList().stream()
                .filter(c -> arrival.equals(c.getFlightPoints().get(c.getFlightPoints().size() - 1)))
                .collect(Collectors.toList());
    }
}
