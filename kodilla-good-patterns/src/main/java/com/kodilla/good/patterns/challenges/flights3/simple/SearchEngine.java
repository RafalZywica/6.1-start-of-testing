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
    public List<Flight> searchByDepartureAndArrival(FlightList flightList, String departure, String arrival) {

        List<Flight> foundFlightsByDeparture = new ArrayList<>();
        List<Flight> foundFlightsByArrival = new ArrayList<>();
        List<Flight> foundFlightsByDepartureAndArrival = new ArrayList<>();

        for (Flight flight: flightList.getFlightList()) {
            if (flight.getDeparture().equals(departure)) foundFlightsByDeparture.add(flight);
            if (flight.getArrival().equals(arrival)) foundFlightsByArrival.add(flight);
        }
        for (Flight flight: foundFlightsByDeparture) {
            for(Flight flight1: foundFlightsByArrival)
                if (flight.getArrival().equals(flight1.getDeparture())) {
                    foundFlightsByDepartureAndArrival.add(flight);
                    foundFlightsByDepartureAndArrival.add(flight1);
                }
        } return foundFlightsByDepartureAndArrival;
        /*List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight: flightList.getFlightList()) {
            for (Flight flight1: flightList.getFlightList()){
                if (flight.getArrival().equals(transition) && flight.getArrival().equals(flight1.getDeparture()) && !flight.getDeparture().equals(flight1.getArrival())) {
                    foundFlights.add(flight);
                    foundFlights.add(flight1);
                }
            }
        }
        return foundFlights;*/
    }
}
