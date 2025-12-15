package com.gokhanul;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Initialize value
        // type of variable -> identifier -> assignment operator -> value
        int age = 30;

        // Changing value of variable
        age = 35;

        // Copieng variable into another variable
        // Camel case notation: myAge -> except the first word, each word starts with a capital letter
        int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge);


        // Primitive Datatypes -> for storing simple values
        byte age1 = 30;
        char letter= 'A';
        boolean isEligible = false;
        short testValue = 4;
        double annualRate = 40.99;

        // To make number more readable we can use underscores
        int viewsCount =123_456_789;

        // Needs a suffix to present the number as a long
        long viewsCount2 = 3_123_456_789L;

        // Needs a suffix to present the number as a float
        float price = 10.99F;


        // Reference types -> for storing complex objects
        // The created variable (Date = now) is an instance of the Date class
        Date now = new Date();
        System.out.println(now);

        // '+' combines to String values
        String message = "  Hello World" + "!!";

        // Gets the length of the String
        System.out.println(message.length());

        // Replacing characters
        System.out.println(message.replace("!", "*"));

        // Set all to uppercase
        message.toUpperCase();

        // Set all to lowercase
        message.toLowerCase();

        // Trim method removes to white spaces
        message.trim();
        System.out.println(message);

        // Escape sequences
        // Puts String value with double quotes
        String message1 = "Hello \"Gokhan\"";
        System.out.println(message1);

        // Inserts a new line
        String message2 = "c:\nWindows\\...";
        System.out.println(message2);

        // Adds a tab
        String message3 = "G\tokhan";
        System.out.println(message3);

    }
}
