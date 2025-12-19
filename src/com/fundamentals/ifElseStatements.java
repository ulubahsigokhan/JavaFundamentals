package com.fundamentals;

public class ifElseStatements {

    public static void main(String args[]) {

        // IF STATEMENT
        // The if statement runs a block of code only when a condition is true.
        // If the condition is false, the code inside the if block is skipped.
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        //-----------------------------------------------------------------------------------------------------

        // IF - ELSE STATEMENT
        // The else statement runs when the if condition is false.
        // Only one of the two blocks will execute.
        int age2 = 15;
        if(age2 >=18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        //-----------------------------------------------------------------------------------------------------

        // IF - ELSE IF - ELSE STATEMENT
        // Else if is used when you need to check multiple conditions.
        // Java checks conditions from top to bottom and executes the first true block.
        int score = 82;
        if (score >= 90){
            System.out.println("Grade: A");
        } else if (score >= 80){
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade: F");
        }

        //-----------------------------------------------------------------------------------------------------

        // NESTED IF STATEMENTS
        // A nested if is an if statement inside another if.
        // This is useful when a condition depends on a previous condition.
        int balance = 500;
        if (balance > 0) {
            if (balance >= 100) {
                System.out.println("Sufficient balance.");
            } else {
                System.out.println("Low balance.");
            }
        }
    }

}
