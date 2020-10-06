package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(World world){
             BigDecimal totalPop = world.getContinents().stream()
                     .flatMap(continent -> continent.getCountries().stream())
                     .map(Country::getPeopleQuantity)
                     .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
             return totalPop;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
