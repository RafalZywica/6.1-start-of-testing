package com.kodilla.exception.test;

public class FlightBrowserRunner {
    public static void main(String[] args) {
        FlightBrowser flightBrowser = new FlightBrowser();

        Flight flight1 = new Flight("Warsaw Chopin Airport", "Heathrow");
        Flight flight2 = new Flight("Heathrow", "Warsaw Chopin Airport");
        Flight flight3 = new Flight("Warsaw Chopin Airport", "Charles De Gaulle Airport");

        try {
            flightBrowser.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival Airport unavailable");
        } finally {
            System.out.println("Arrival Airport search complete");
        }


    }
}
