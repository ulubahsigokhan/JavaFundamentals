package com.fundamentals;

public class Operators {

    public static void main(String[] args) {

        // ARITHMETIC OPERATORS (SIMPLE CALCUTOR)
        // This example shows how Java uses arithmetic operators (+, -, *, /, %) to perform basic calculations
        // between two numbers

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        //-----------------------------------------------------------------------------------------------------

        // Comparison com.gokhanul.Operators (NUMBER CHECKER)
        // This example demonstrates comparison operator (>, <, ==, !=) which return true or false when
        // comparing values

        byte x = 15;
        byte y = 20;

        System.out.println("x is greater than y: " + (x > y));
        System.out.println("x is less than y: " + (x < y));
        System.out.println("x is equals to y: " + (x == y));
        System.out.println("x not equal to y" + (x != y));

        //-----------------------------------------------------------------------------------------------------

        // Logical com.gokhanul.Operators (LOGIN VALIDATION)
        // This example shows logical operators (&&, ||, !) used to combine conditions, commonly seen in
        // validation and decision-making

        String username = "admin";
        String password = "0000";

        boolean isValid = username.equals("admin") && password.equals("0000");

        System.out.println("Login succesful: " + isValid);

        //-----------------------------------------------------------------------------------------------------

        // Increment Operator (++)
        // The increment operator increases a variables value by 1.
        // It can be used before or after the variable.
        int g = 5;
        g++;
        System.out.println(g);

        // Increments more
        System.out.println(g = g + 2);
        System.out.println(g += 2); // (+=) is called Compound Assignment

        //-----------------------------------------------------------------------------------------------------

        // Decrement Operator (--)
        // The decrement operator decreases a variable’s value by 1.
        // It can be used before or after the variable.
        int j = 5;
        j--;
        System.out.println(j);

        // Decrements more
        System.out.println(j = j - 2);
        System.out.println(j -= 2); // (-=) is called Compound Assignment

        //-----------------------------------------------------------------------------------------------------

        // Post-Increment vs Pre-Increment (x++ vs ++x)
        // x++ → use the value first, then increase
        // ++x → increase first, then use the value
        int m = 5;
        System.out.println(m++); // prints 5
        System.out.println(m);  // now 6

        int n = 5;
        System.out.println(++n); // prints 6

        //-----------------------------------------------------------------------------------------------------

        // Post-Decrement vs Pre-Decrement (x-- vs --x)
        // x-- → use the value first, then decrease
        // --x →decrease first, then use the value
        int o = 5;
        System.out.println(o--); // prints 5
        System.out.println(o);  // now 4

        int p = 5;
        System.out.println(--p); // prints 4

        //-----------------------------------------------------------------------------------------------------

        // Compound Multiplication (*=)
        // *= multiplies a variable by a value and assigns the result.
        int l = 4;
        l *= 2;
        System.out.println(l); // 8

        //-----------------------------------------------------------------------------------------------------

        // Compound Division (/=)
        // *= divides a variable by a value and assigns the result.
        int e = 20;
        e /= 4;
        System.out.println(e); // 5

        //-----------------------------------------------------------------------------------------------------

        // Compound Remainder (%=)
        // %= finds the remainder and stores it back in the variable.
        int h = 10;
        h %= 3;
        System.out.println(h); // 1
            }
        }


