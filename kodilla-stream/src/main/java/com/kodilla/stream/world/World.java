package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public BigDecimal getPeopleQuantity(){
             BigDecimal totalPop = continents.stream()
            .flatMap(continent -> continent.countries.stream())
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
             return totalPop;


    }
}
