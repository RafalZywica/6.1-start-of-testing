package com.kodilla.good.patterns.challenges.flights3.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {

    public List<Flight> searchByDeparture(FlightList flightList, String departure) {
        return flightList.getFlightList().stream()
                .filter(f -> departure.equals(f.getDeparture()))
                .collect(Collectors.toList());
    }
    public List<Flight> searchByArrival(FlightList flightList, String arrival) {
        return flightList.getFlightList().stream()
                .filter(f -> arrival.equals(f.getDeparture()))
                .collect(Collectors.toList());
    }
    public List<Flight> searchByTransition(FlightList flightList, String transition) {
        /*return flightList.getFlightList().stream()
                .map(f -> {
                    Flight flight = flightList.getFlightList().stream()
                            .filter(g ->
                                    f.getArrival().equals(g.getDeparture()) &&
                                            !f.getDeparture().equals(g.getArrival()) &&
                                            f.getArrival().equals(transition))
                            ;
                })*/
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight: flightList.getFlightList()) {
            Flight checkFlight = flight;
            for (Flight flight1: flightList.getFlightList()){
                if (flight.getArrival().equals(transition) && flight.getArrival().equals(flight1.getDeparture()) && !flight.getDeparture().equals(flight1.getArrival())) {
                    foundFlights.add(flight);
                    foundFlights.add(flight1);
                }
            }
        }
        return foundFlights;
    }
}
