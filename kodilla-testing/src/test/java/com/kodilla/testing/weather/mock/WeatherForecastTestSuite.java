package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    Map<String, Double> temperaturesMap = new HashMap<>();

    @Mock
    private Temperatures temperaturesMock;
    @BeforeEach
    public void beforeEveryTest() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverage() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        List<Double> a = new ArrayList<Double>(temperaturesMap.values());
        Double sum = 0.0;
        for(Double position:a) {
            sum = sum + position;
        }
        Double average = sum / a.size();
        System.out.println("Average temperature equals: " + average);

        //Then
        Assertions.assertEquals((25.5 + 26.2 + 24.8 + 25.2 + 26.1) / 5.0, average);
    }
    @Test
    void testCalculateMedian() {
        //Given

        //When
        List<Double> a = new ArrayList<Double>(temperaturesMap.values());
        Collections.sort(a);
        Double sum = 0.0;
        Double median;
        if (a.size() % 2 == 0) {
            median = (double)a.get((int) (((double)a.size() + 1.0) / 2.0 - 1.0)) ;
        } else {
            median = a.get(((a.size()) + 1) / 2 - 1);
        }
        System.out.println("Median of temperatures equals: " + median);

        //Then
        Assertions.assertEquals(25.5, median);
    }
}
