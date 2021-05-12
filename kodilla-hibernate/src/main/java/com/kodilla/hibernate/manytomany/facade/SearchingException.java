package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {

    public static String ERR_NO_COMPANY = "Company not found";
    public static String ERR_NO_EMPLOYEE =  "Employee not found";

    public SearchingException(String message){
        super(message);
    }
}
