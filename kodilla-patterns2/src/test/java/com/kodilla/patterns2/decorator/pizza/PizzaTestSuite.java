package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testPizzaWithSweetCornAndExtraCheeseGetDescription() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new SweetCornDecorator(thePizza);
        thePizza = new ExtraMozarellaDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals(description, "Pizza with tomato sauce and mozarella cheese + Sweet corn + Extra mozarella");
    }

    @Test
    public void testPizzaWithSweetCornAndExtraCheeseGetCost() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new SweetCornDecorator(thePizza);
        thePizza = new ExtraMozarellaDecorator(thePizza);
        //When
        BigDecimal cost = thePizza.getCost();
        //Then
        assertEquals(cost, new BigDecimal(26));
    }
}
