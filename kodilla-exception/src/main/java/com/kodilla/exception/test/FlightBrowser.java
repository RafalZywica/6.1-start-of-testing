package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightBrowser {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw Chopin Airport", true);
        flightMap.put("Heathrow", true);

        if (flightMap.containsKey(flight.getArrivalAirport()) == false) {
            throw new RouteNotFoundException();
        }
    }
}
