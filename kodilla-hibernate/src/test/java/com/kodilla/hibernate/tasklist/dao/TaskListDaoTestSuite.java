package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "First List";
    private static final String DESCRIPTION = "TestList: Learn Hibernate";

    @Test
    void testTaskListDaoFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskLists = taskListDao.findByTaskListName("First List");

        //Then
        assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}