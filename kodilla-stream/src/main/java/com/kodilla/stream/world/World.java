package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();
    /*World world1 = new World();

    public BigDecimal getPeopleQuantity(){
             BigDecimal totalPop = world1.getContinents().stream()
                     .flatMap(continent -> continent.getCountries().stream())
                     .map(Country::getPeopleQuantity)
                     .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
             return totalPop;
    }*/

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
