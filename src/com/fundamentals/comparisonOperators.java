package com.fundamentals;

public class comparisonOperators {

    public static void main(String args[]) {

        // EQUAL TO (==)
        // The equal to operator (==) checks whether two values are the same.
        // It returns a true if they are equal, otherwise false.
        int a = 10;
        int b = 10;
        boolean result = a == b;
        System.out.println(result); // true

        //-----------------------------------------------------------------------------------------------------

        // NOT EQUAL TO (!=)
        // The not equal to operator (!=) checks whether two values are different.
        // It returns true if they are not equal.
        int x = 5;
        int y = 8;
        boolean isTrue = x != y;
        System.out.println(result); // true

        //-----------------------------------------------------------------------------------------------------

        // GREATER THAN (>)
        // The greater than operator (>) checks whether the left value is bigger than the right value.
        int score = 90;
        boolean isHighScore = score > 80;
        System.out.println(isHighScore); // true

        //-----------------------------------------------------------------------------------------------------

        // LESS THAN (<)
        // The less than operator (<) checks whether the left value is smaller than the right value.
        int temperature = 60;
        boolean isCold = temperature < 70;
        System.out.println(isCold); // true

        //-----------------------------------------------------------------------------------------------------

        // GREATER THAN OR EQUAL TO (>=)
        // The greater than or equal to operator (>=) checks if the left value is greater than or equal
        // to the right value.
        int age = 18;
        boolean canVote = age >= 18;
        System.out.println(canVote); // true

        //-----------------------------------------------------------------------------------------------------

        // LESS THAN OR EQUAL TO (<=)
        // The less than or equal to operator (<=) checks if the left value is less than or equal
        // to the right value.
        int itemsInCart = 3;
        boolean eligibleForDiscount = itemsInCart <= 5;
        System.out.println(eligibleForDiscount); // true

        //-----------------------------------------------------------------------------------------------------

        // COMPARING WITH LOGICAL OPERATORS (REALISTIC EXAMPLE)
        // Comparison operators are often used together with logical operators to form conditions.
        int age2 = 22;
        double salary = 45000;
        boolean eligibleForLoan = age2 >= 21 && salary >= 40000;
        System.out.println(eligibleForLoan); // true
    }
}
