package com.kodilla.testing;

import com.kodilla.testing.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator(2, 1);

        int resultOfAddition = calculator.add();

        if (resultOfAddition == 3) {
            System.out.println("Test dodawania OK");
        } else {
            System.out.println("Error!");
        }

        int resultOfSubtraction = calculator.subtract();

        if (resultOfSubtraction == 1) {
            System.out.println("Test odejmowania OK");
        } else {
            System.out.println("Error!");
        }

    }
}