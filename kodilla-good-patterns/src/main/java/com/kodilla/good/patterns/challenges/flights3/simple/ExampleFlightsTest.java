package com.kodilla.good.patterns.challenges.flights3.simple;

import java.util.List;

public class ExampleFlightsTest {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Frankfurt");
        Flight flighy2 = new Flight("Frankfurt", "Paris");
        Flight flight3 = new Flight("Frankfurt", "London");
        Flight flight4 = new Flight("London", "New York");
        Flight flight5 = new Flight("Frankfurt", "Warsaw");
        Flight flight6 = new Flight("Warsaw", "Hamburg");
        Flight flight7 = new Flight("Hamburg", "London");

        FlightList flightList = new FlightList();

        SearchEngine searchEngine = new SearchEngine();

        flightList.addFlight(flight1);
        flightList.addFlight(flighy2);
        flightList.addFlight(flight3);
        flightList.addFlight(flight4);
        flightList.addFlight(flight5);
        flightList.addFlight(flight6);
        flightList.addFlight(flight7);

        List<Flight> foundFlights;

        System.out.println("\nSearch for departures from Warsaw:\n ");
        foundFlights = searchEngine.searchByDeparture(flightList, "Warsaw");
        for(Flight flight: foundFlights) System.out.println(flight);
        System.out.println("\nSearch for arrivals to Frankfurt:\n ");
        foundFlights = searchEngine.searchByArrival(flightList, "Frankfurt");
        for(Flight flight: foundFlights) System.out.println(flight);
        System.out.println("\nSearch for flights from Warsaw to London:\n");
        foundFlights = searchEngine.searchByDepartureAndArrival(flightList, "Warsaw", "London");
        for(Flight flight: foundFlights) System.out.println(flight);
    }
}
