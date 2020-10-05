package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostCount;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate birthDate, final int publishedPostCount) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.publishedPostCount = publishedPostCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostCount() {
        return publishedPostCount;
    }
    @Override
    public String toString() {
        return "ForumUser{" + "UserName='" + userName + '\'' + ", Sex='" + sex + '\'' + ", BirthDate='" + birthDate + "\'" + ", PublishedPostCount='" + publishedPostCount +'\'' + '}';
    }
}
