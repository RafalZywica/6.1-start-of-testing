package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        TasksQueue studentOne = new StudentOne();
        TasksQueue studentTwo = new StudentTwo();
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        studentOne.registerObserver(mentor1);
        studentTwo.registerObserver(mentor2);
        // When
        studentOne.addTask("Task 24.4");
        studentOne.addTask("Task 24.5");
        studentTwo.addTask("Task 23.1");
        // Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
