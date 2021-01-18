package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void logEvent() {
        logger = Logger.INSTANCE;
        logger.log("Pan Andrzej wszedł do budynku");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Pan Andrzej wszedł do budynku", lastLog);
    }
}
