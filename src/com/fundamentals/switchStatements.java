package com.fundamentals;

import java.security.spec.RSAOtherPrimeInfo;

public class switchStatements {

    public static void main(String args[]) {

        // A switch statement is used to select one block of code from many options based on a single value.
        // It's a cleaner alternative to long if-else-if chains when you are comparing one value or against
        // fixed values. The switch expression is evaluated once, and its value is compared to each case.
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // The break statement stops execution after a matching case.
                       // Without it, Java continues executing the next cases (fall-through)
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                // The default case runs when no case matches. It's similar to the else in an if-else chain.
        }

        //-----------------------------------------------------------------------------------------------------

        // MULTIPLE CASES FOR ONE ACTION
        // You can group cases together when they should run the same code/
        char grade = 'A';
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Good");
                break;
            default:
                System.out.println("Needs improvements");

        }

        //-----------------------------------------------------------------------------------------------------

        // SWITCH WITH STRINGS
        // Java allows switch statements with String values (Java 7+).
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("Full access");
                break;
            case "user":
                System.out.println("Limited access");
                break;
            default:
                System.out.println("Guest access");
        }

    }
}
