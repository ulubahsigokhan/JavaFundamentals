package com.gokhanul;

public class javaCasting {

    public static void main(String[] args) {

        // IMPLICIT CASTING (Widening Conversion)
        // Implicit casting happens automatically when converting a smaller data type to larger one.
        // No data is lost, Java does this safely for you.
        int number = 10;
        double result = number; // implicit casting
        System.out.println(result); // 10.0

        //----------------------------------------------------------------------------------------------------

        // EXPLICIT CASTING (Narrowing Conversion)
        // Explicit casting is required when converting a larger data type to a smaller one.
        // You must manually specify the target type because data may be lost.
        double price = 9.99;
        int roundedPrice = (int) price; // explicit casting
        System.out.println(roundedPrice); // 9

        //----------------------------------------------------------------------------------------------------

        // IMPLICIT CASTING IN EXPRESSIONS
        // When different

        //----------------------------------------------------------------------------------------------------

        // WE CAN ALSO CONVERT STRING TO AN INTEGER OR OTHER DATA TYPES LIKE DOUBLE
        // When a user makes an input, this input is in most cases a String type
        // Converting a String to an Integer
        String age = "65";
        int ageInt = Integer.parseInt(age);
        System.out.println("In 5 years I will be " + (ageInt + 5) + " years old."); // 70




    }
}
