package com.gokhanul;

import java.util.Scanner;

public class javaScanner {

    public static void main(String args[]) {

        // One scanner object is enough, this was just for practice!

        // READING A SINGLE WORD WITH Scanner.next()
        // next() reads only one word from user input.
        // It stops at whitespace (space, tab, or Enter).
        // This is useful for usernames, commands, or single values.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String firstName = scanner.next();
        System.out.println("Hello, " + firstName);

        //----------------------------------------------------------------------------------------------------

        // READING A FULL LINE WITH Scanner.nextLine()
        // nextLine() reads the entire line, including spaces, until Enter is pressed.
        // This is best for full names, addresses, or sentences.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String fullName = scanner2.nextLine();
        System.out.println("Welcome: " + fullName);

        //----------------------------------------------------------------------------------------------------

        // CLEANING INPUT WITH trim()
        // trim() removes leading and trailing spaces from a String.
        // This prevents issues caused by accidental spaces in user input.
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = scanner3.nextLine().trim();
        System.out.println("Username saved as: " + username);

        //----------------------------------------------------------------------------------------------------

        // READING AN INTEGER WITH Scanner.nextInt()
        // nextInt() reads whole numbers only.
        // It does not read the Enter key, which matters when mixing with nextLine().
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner4.nextInt();
        System.out.println("You are " + age + " years old.");

    }
}
