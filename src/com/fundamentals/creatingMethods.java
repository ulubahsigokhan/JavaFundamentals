package com.fundamentals;

public class creatingMethods {

    // A method is a named block of code that performs a specific task.
    // Instead of writing the same code again and again, you put it in a method and reuse it.

    // SIMPLE VOID METHOD (NO RETURN VALUE)
    // This type of method is used when you want to perform an action but you don't need a value back.
    // Common uses are printing messages, logging, or triggering behavior.

    public static void sayHello() {
        System.out.println("Hello, welcome to Java!");
    }

    //-----------------------------------------------------------------------------------------------------

    // METHOD WITH A RETURN TYPE (RETURNS A VALUE)
    // Uses when you need a result from the method, such as a calculation or a decision.

    public static int addNumbers() {
        return 5 + 3;
    }

    //-----------------------------------------------------------------------------------------------------

    // METHOD WITH PARAMETERS
    // This method allows you to pass data into it, making the method reusable with different values.

    public static int multiply(int a, int b) {
        return a * b;
    }
    //-----------------------------------------------------------------------------------------------------



    // RESULTS
    public static void main(String[] args) {

        // VOID METHOD
        sayHello();

        //-----------------------------------------------------------------------------------------------------

        // METHOD WITH RETURN TYPE
        int result = addNumbers();
        System.out.println(result);

        //-----------------------------------------------------------------------------------------------------

        // METHOD WITH PARAMETERS
        int result2 = multiply(12, 2);
        System.out.println(result2);
    }




}
