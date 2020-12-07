package com.kodilla.good.patterns.challenges.flights2;

public class IndirectFlight implements Flight{

    private String flightNumber;
    private Airport departureAirport;
    private Airport transitionAirport;
    private Airport arrivalAirport;

    public IndirectFlight(String flightNumber, Airport departureAirport, Airport transitionAirport, Airport arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.transitionAirport = transitionAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getTransitionAirport() {
        return transitionAirport;
    }

    @Override
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "IndirectFlight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport=" + departureAirport +
                ", transitionAirport=" + transitionAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}
