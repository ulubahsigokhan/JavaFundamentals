package com.fundamentals;

import java.util.Scanner;

public class Exercise {

    public static void main(String args[]) {

        /*
        If the number is divisible by 5 get Fizz.
        If the number is divisible by 3 get Buzz.
        If the number is divisible by 5 and 3 get FizzBuzz.
        If the number is not divisible by 5 and 3 get the same number.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = scan.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

    }
}
