package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "Driving Task";
    public static final String PAINTINGTASK = "Painting Task";
    public static final String SHOPPINGTASK = "Shopping Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive miss Jones", "To Opera house", "Limousine");
            case PAINTINGTASK:
                return new PaintingTask("Paint for mister Banana", "White", "House");
            case SHOPPINGTASK:
                return new ShoppingTask("Buy", "Beer", 6);
            default:
                return null;
        }
    }
}
