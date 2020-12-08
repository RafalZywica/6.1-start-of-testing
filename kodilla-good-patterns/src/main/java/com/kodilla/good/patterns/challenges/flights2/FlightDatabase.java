package com.kodilla.good.patterns.challenges.flights2;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {

    private final List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {

        flightList.add(flight);

        for (int i =0; i < flightList.size(); i++){
            for (int j =0; j < flightList.size(); j++) {
                if (flightList.get(i).getArrivalAirport() != flightList.get(j).getArrivalAirport() &&
                        flightList.get(i).getArrivalAirport() == flightList.get(j).getDepartureAirport() &&
                        !flightList.get(i).getFlightNumber().equals(flightList.get(j).getFlightNumber())) {
                    IndirectFlight indirectFlight = new IndirectFlight(flightList.get(i).getFlightNumber() +
                            "+" + flightList.get(j).getFlightNumber(), flightList.get(i).getDepartureAirport(), flightList.get(i).getArrivalAirport(), flightList.get(j).getArrivalAirport());
                    System.out.println(indirectFlight);
                    flightList.add(indirectFlight);
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
