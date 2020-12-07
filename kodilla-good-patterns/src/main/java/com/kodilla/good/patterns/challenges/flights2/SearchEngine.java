package com.kodilla.good.patterns.challenges.flights2;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {
    private Flight checkFlight;
    public List<Flight> searchByDeparture(FlightDatabase flightDatabase, Airport departureAirport) {
        return flightDatabase.getFlightList().stream()
                .filter( f -> departureAirport.equals(f.getDepartureAirport()))
                .collect(Collectors.toList());
    }
    public List<Flight> searchByArrival(FlightDatabase flightDatabase, Airport arrivalAirport) {
        return flightDatabase.getFlightList().stream()
                .filter( f -> arrivalAirport.equals(f.getArrivalAirport()))
                .collect(Collectors.toList());
    }
    /*public List<Flight> searchByTransition(FlightDatabase flightDatabase, Airport transitionAirport) {
        return flightDatabase.getFlightList().stream()
                .forEach(f -> transitionAirport {


                });

    }*/

}
