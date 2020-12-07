package com.kodilla.good.patterns.challenges.flights2;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {

    private List<Flight> flightList = new ArrayList<>();
    private IndirectFlight indirectFlight;
    private Flight checkFlight;

    public void addFlight(Flight flight) {

        flightList.add(flight);

        for (Flight flight1: flightList){
            checkFlight = flight1;
            for (Flight flight2: flightList) {
                if (flight1.getArrivalAirport() != flight2.getArrivalAirport() && checkFlight.getArrivalAirport() == flight2.getDepartureAirport() && flight1.getFlightNumber() != flight2.getFlightNumber()) {
                    indirectFlight = new IndirectFlight(checkFlight.getFlightNumber() + "+" + flight2.getFlightNumber(), checkFlight.getDepartureAirport(), checkFlight.getArrivalAirport(), flight2.getArrivalAirport());
                    System.out.println(indirectFlight);
                    /*flightList.add(indirectFlight);*/
                }
             /*if (checkFlight.getArrivalAirport() == flight2.getDepartureAirport() && checkFlight.getFlightNumber() != flight2.getFlightNumber()) {
                 flightList.add(indirectFlight);
                 System.out.println("lala");
             }*/
            }
        }

        /*flightList.stream()
                .forEach(f -> { ()
                });*/
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flightList=" + flightList +
                '}';
    }
}
