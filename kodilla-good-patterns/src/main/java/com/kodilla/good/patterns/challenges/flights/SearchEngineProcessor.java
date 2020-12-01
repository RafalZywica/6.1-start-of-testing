package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class SearchEngineProcessor {

    public void process() {
        SearchEngine searchEngine = new SearchEngine();
        ExampleFlights exampleFlights = new ExampleFlights();
        exampleFlights.generateExampleFlightlist();
        FlightList flightList = exampleFlights.getFlightList();

        List<Flight> flightsFromWarsaw = searchEngine.searchByDeparture(flightList, "Warsaw");
        System.out.println("Departures from Warsaw: \n");
        for(Flight flight: flightsFromWarsaw) System.out.println(flight);
        System.out.println("\n");

        List<Flight> flightsToCapeTown = searchEngine.searchByArrival(flightList, "Cape Town");
        System.out.println("Arrivals to Cape Town: \n");
        for(Flight flight: flightsToCapeTown) System.out.println(flight);
        System.out.println("\n");

        List<Flight> flightsThroughMoscow = searchEngine.searchByTransition(flightList, "Moscow");
        System.out.println("Transitions through Moscow: \n");
        for(Flight flight: flightsThroughMoscow) System.out.println(flight);
        System.out.println("\n");
    }
}
