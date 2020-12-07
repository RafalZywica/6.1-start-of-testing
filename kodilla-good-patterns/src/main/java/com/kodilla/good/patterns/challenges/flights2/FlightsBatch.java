package com.kodilla.good.patterns.challenges.flights2;

import java.util.List;

public class FlightsBatch {

    public static void main(String[] args) {
        Airport airport1 = new Airport("Warsaw", "Lotnisko Chopina");
        Airport airport2 = new Airport("Frankfurt", "Luftwaffe");
        Airport airport3 = new Airport("Paryż", "Charles de Gaulle");
        DirectFlight flight1 = new DirectFlight("1", airport1, airport2 );
        DirectFlight flight2 = new DirectFlight("2", airport2, airport3);
        /*IndirectFlight flight3 = new IndirectFlight("3", airport1, airport2, airport3);*/
        FlightDatabase flightDatabase = new FlightDatabase();

        flightDatabase.addFlight(flight1);
        flightDatabase.addFlight(flight2);
        /*flightDatabase.addFlight(flight3);*/
        for (Flight flight : flightDatabase.getFlightList()) {
            System.out.println(flight);
        }
        SearchEngine searchEngine = new SearchEngine();
        List<Flight> departingFromWarsaw = searchEngine.searchByDeparture(flightDatabase, airport1);
        System.out.println("\n" + "Flights departing from Warsaw Airport\n");
        for (Flight flight: departingFromWarsaw) System.out.println(flight);
    }
}
