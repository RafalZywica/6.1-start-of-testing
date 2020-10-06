package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("40000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country france = new Country(new BigDecimal("67000000"));
        Country USA = new Country(new BigDecimal("300000000"));
        Country mexico = new Country(new BigDecimal("126000000"));

        Continent northAmerica = new Continent();
        Continent europe = new Continent();
        World world = new World();

        northAmerica.addCountry(USA);
        northAmerica.addCountry(mexico);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        world.addContinent(europe);
        world.addContinent(northAmerica);
        //When
        BigDecimal totalPop = world.getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        /*BigDecimal estimated = world.getPeopleQuantity();*/

        //Then
        assertEquals(new BigDecimal("613000000"), totalPop);
    }

}
