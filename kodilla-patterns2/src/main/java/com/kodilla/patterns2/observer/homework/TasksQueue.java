package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final List<String> tasks;
    private final String name;

    public TasksQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver homeworkObserver : observers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
