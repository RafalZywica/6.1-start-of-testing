package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testNotThrowingExceptions() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When&THen
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 3));
    }

    @Test
    void testExceptions() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When&Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5))
        );
    }

}
