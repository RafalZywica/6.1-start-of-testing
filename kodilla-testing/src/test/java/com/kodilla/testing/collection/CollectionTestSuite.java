package com.kodilla.testing.collection;

import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Test Case: end");
    }

    @DisplayName("when creating an empty List, " +
            "then exterminate should return an empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //given
        Integer a[] = new Integer[]{};
        List<Integer> list = Arrays.asList(a);
        OddNumbersExterminator one = new OddNumbersExterminator();
        Integer b[] = new Integer[]{};
        List<Integer> list2 = Arrays.asList(b);

        //when
        List<Integer> result = one.exterminate(list);
        System.out.println("Testing" + result);

        //then
        Assertions.assertEquals(list2, result);

    }

    @DisplayName("when creating a normal List, " +
            "then exterminate should return a list without odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {

        //given
        Integer a[] = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(a);
        OddNumbersExterminator one = new OddNumbersExterminator();
        Integer b[] = new Integer[]{2, 4};
        List<Integer> list2 = Arrays.asList(b);

        //when
        List<Integer> result = one.exterminate(list);
        System.out.println("Testing" + result);

        //then
        Assertions.assertEquals(list2, result);

    }
}

