package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAddition() {
        //When
        calculator.add(1, 2);
        //Then
        //do nothing
    }
    @Test
    void testSubtraction() {
        //Given
        //When
        calculator.sub(1, 2);
        //Then
        //do nothing
    }
    @Test
    void testMultiplication() {
        //Given
        //When
        calculator.mul(1, 2);
        //Then
        //do nothing
    }
    @Test
    void testDivision() {
        //Given
        //When
        calculator.div(1, 2);
        //Then
        //do nothing
    }
}
