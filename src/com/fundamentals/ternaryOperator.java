package com.fundamentals;

public class ternaryOperator {

    public static void main(String[] args) {

        // The ternary operator is a short, one-line alternative to if-else.
        // It evaluates a condition and returns one of two values.
        // Is great to use by simple logic.
        int age = 17;
        String result = (age >= 21) ? "Adult" : "Minor";
        System.out.println(result); // Minor is selected

        int score = 98;
        String passed = (score >= 95) ? "Passed" : "Failed";
        System.out.println(passed); // Passed

    }
}
