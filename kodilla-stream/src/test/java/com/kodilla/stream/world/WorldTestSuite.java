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

        //When
        northAmerica.countries.add(USA);
        northAmerica.countries.add(mexico);

        europe.countries.add(poland);
        europe.countries.add(germany);
        europe.countries.add(france);

        World world = new World();

        BigDecimal estimated = world.getPeopleQuantity();

        //Then
        assertEquals(613000000, estimated);
    }

}
