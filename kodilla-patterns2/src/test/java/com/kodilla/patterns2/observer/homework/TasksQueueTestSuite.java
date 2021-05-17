package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        TasksQueue student = new Student();
        Mentor mentor = new Mentor("Mentor");
        student.registerObserver(mentor);
        // When
        student.addTask("Task 24.4");
        student.addTask("Task 24.5");
        // Then
        assertEquals(2, mentor.getUpdateCount());
    }
}
