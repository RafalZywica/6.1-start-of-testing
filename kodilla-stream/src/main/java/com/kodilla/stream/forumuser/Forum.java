package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(0001, "Julius", 'M', LocalDate.of(1996, Month.JANUARY, 27), 14 ));
        userList.add(new ForumUser(0002, "Constantine", 'M', LocalDate.of(2004, Month.APRIL, 7), 37 ));
        userList.add(new ForumUser(0003, "Jadwiga", 'F', LocalDate.of(1996, Month.JUNE, 2), 45 ));
        userList.add(new ForumUser(0004, "Cornelia", 'F', LocalDate.of(1996, Month.DECEMBER, 17), 26 ));
        userList.add(new ForumUser(0005, "Andrew", 'M', LocalDate.of(1996, Month.MARCH, 12), 1 ));
        userList.add(new ForumUser(0006, "Joshua", 'M', LocalDate.of(1996, Month.NOVEMBER, 22), 0 ));
        userList.add(new ForumUser(0007, "Anthony", 'M', LocalDate.of(1996, Month.SEPTEMBER, 30), 10 ));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
