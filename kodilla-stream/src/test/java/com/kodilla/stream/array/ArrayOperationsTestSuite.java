package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Before
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //When
        double average = new ArrayOperations1().getAverage(array);
        //Then
        assertEquals(55.0, average);

    }
}
