package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        for (String task1: tasks)
            System.out.println(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
