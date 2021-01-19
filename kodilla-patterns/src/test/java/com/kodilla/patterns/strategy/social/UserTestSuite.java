package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User johnny = new Millenials("Johnny");
        User betty  = new YGeneration("Betty");
        User hannah = new ZGeneration("Hannah");
        //When
        String johnnyShares = johnny.publish();
        System.out.println("Johnny published on " + johnnyShares);
        String bettyShares = betty.publish();
        System.out.println("Betty published on " + bettyShares);
        String hannahShares = hannah.publish();
        System.out.println("Hannah published on " + hannahShares);
        //Then
        assertEquals("Facebook", johnnyShares);
        assertEquals("Twitter", bettyShares);
        assertEquals("Snapchat", hannahShares);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User johnny = new Millenials("Johnny");
        //When
        String johnnyShares = johnny.publish();
        System.out.println("Johnny shared on " + johnnyShares);
        johnny.setSocialPublisher(new SnapchatPublisher());
        String johnnyIndividuallyShares = johnny.publish();
        System.out.println("Johnny individually shared on" + johnnyIndividuallyShares);
        //Then
        assertEquals("Facebook", johnnyShares);
        assertEquals("Snapchat", johnnyIndividuallyShares);
    }
}
