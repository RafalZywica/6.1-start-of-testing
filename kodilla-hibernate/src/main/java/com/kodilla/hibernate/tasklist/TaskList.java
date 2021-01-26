package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {

    private int id;
    private String taskListName;
    private String description;

    public TaskList() {
    }

    public TaskList(String taskListName, String description) {
        this.taskListName = taskListName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "TASKLISTNAME")
    public String getTaskListName() {
        return taskListName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskListName(String taskListName) {
        this.taskListName = taskListName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
