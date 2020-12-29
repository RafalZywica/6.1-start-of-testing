package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAddition() {
        //When
        Double result = calculator.add(1, 2);
        //Then
        assertEquals(3, result);
    }
    @Test
    void testSubtraction() {
        //Given
        //When
        Double result = calculator.sub(1, 2);
        //Then
        assertEquals(-1, result);
    }
    @Test
    void testMultiplication() {
        //Given
        //When
        Double result = calculator.mul(1, 2);
        //Then
        assertEquals(2, result);
    }
    @Test
    void testDivision() {
        //Given
        //When
        Double result = calculator.div(1, 2);
        //Then
        assertEquals(0.5, result);
    }
}
