package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testDoneList() {
        //Before
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        TaskList taskList = board.getDoneList();
        Boolean result;
        //When
        System.out.println("Done List: \n" + taskList);
        if (taskList == null) {
            result = false;
        } else {
            result = true;
        }
        //Then
        assertEquals(true, result);
    }
    @Test
    void testInProgressList() {
        //Before
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        TaskList taskList = board.getInProgressList();
        Boolean result;
        //When
        System.out.println("In Progress List: \n" + taskList);
        if (taskList == null) {
            result = false;
        } else {
            result = true;
        }
        //Then
        assertEquals(true, result);
    }
    @Test
    void testToDoList() {
        //Before
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        TaskList taskList = board.getToDoList();
        Boolean result;
        //When
        System.out.println("To do List \n " + taskList);
        if (taskList == null) {
            result = false;
        } else {
            result = true;
        }
        //Then
        assertEquals(true, result);
    }
    @Test
    void testAddTask() {
        //Before
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        TaskList taskList = board.getDoneList();
        Boolean result;
        //When
        taskList.addTask("Do Laundry");
        if (taskList.getTasks().contains("Do Laundry")) {
            result = true;
        } else {
            result = false;
        }
        //Then
        assertEquals(true, result);
    }


}
