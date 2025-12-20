package com.fundamentals;

import java.util.Scanner;

public class loops {

    public static void main(String args[]) {

        // WHILE LOOP
        // A while loop is used when you don't know in advance how many times the loop should run.
        // The loops keeps running as long as the condition is true.
        // If the condition is false at the start, the loop will not run at all.
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("Enter a command (type 'quit to exit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }

        System.out.println("Program ended.");

        //-----------------------------------------------------------------------------------------------------

        // DO-WHILE LOOP
        // A do-while loop is similar to a while loop, but it always runs at least once.
        // This is because the condition is checked after the loop body executes.
        String choice;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Say Hello");
            System.out.println("2 - Say Goodbye");
            System.out.print("Type 'exit' to quit: ");

            choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Hello1!");
            } else if (choice.equals("2")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid input!");
            }
        } while (!choice.equalsIgnoreCase("exit"));

        System.out.println("Menu closed.");

        //-----------------------------------------------------------------------------------------------------

        // FOR LOOP
        // A for loop is ideal when you know exactly how many times you want the loop to run.
        // By changing the start value, condition, and increment/decrement, you can easily control
        // the direction of the loop.
        // Counting from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Forward count: " + i);
        }

        // Counting from 10 to 1
        for (int i = 10; i >=1; i--) {
            System.out.println("Backward count: " + i);
        }

        //-----------------------------------------------------------------------------------------------------

        // FOR-EACH LOOP (ADVANCED FOR LOOP)
        // A for-each loop is used to iterate through arrays or collections without using an index.
        // Instead of controlling a counter, Java gives you each value one by one.
        int[] numbers = {2, 4, 6, 8, 10};
        for(int number : numbers) {
            System.out.println("Number: " + number);
        }

        //-----------------------------------------------------------------------------------------------------

        // NESTED FOR LOOPS WITH STRINGS
        // When using nested for loops with Strings, the outer loops usually controls which String you are
        // working with, and the inner loop processes each character inside tha String
        String[] words = {"Java", "Loop", "Practice"};
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word: " + words[i]);

            for (int j = 0; j <words[i].length(); j++) {
                System.out.println("Character: " + words[i].charAt(j));
            }

        }

        // Print a String in a triangle pattern
        String word = "JAVA";
        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }

    }

}
