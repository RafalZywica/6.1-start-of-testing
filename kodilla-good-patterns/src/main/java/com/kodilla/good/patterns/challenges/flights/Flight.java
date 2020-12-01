package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Objects;

public class Flight {

    private final int flightNumber;
    private final List<String> flightPoints;

    public Flight(int flightNumber, List<String> flightPoints) {
        this.flightNumber = flightNumber;
        this.flightPoints = flightPoints;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public List<String> getFlightPoints() {
        return flightPoints;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", flightPoints=" + flightPoints +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber &&
                Objects.equals(flightPoints, flight.flightPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, flightPoints);
    }
}
