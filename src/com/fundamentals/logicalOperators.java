package com.fundamentals;

public class logicalOperators {

    public static void main(String args[]) {

        // LOGICAL AND (&&)
        // The logical AND operator (&&) returns true only if both conditions are true.
        // If either condition is false, the result is false.
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println(canDrive); // true

        //-----------------------------------------------------------------------------------------------------

        // LOGICAL OR (||)
        // The logical OR operator (||) return true if at least on condition is true.
        // It returns false only when both conditions are false/
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean canRelax = isWeekend || isHoliday;
        System.out.println(canRelax); // true

        //-----------------------------------------------------------------------------------------------------

        // LOGICAL NOT (!)
        // The logical NOT (!) operator reverses a boolean value:
        // true becomes false
        // false becomes true
        boolean isRaining = false;
        boolean needUmbrella = !isRaining;
        System.out.println(needUmbrella); // true

        //-----------------------------------------------------------------------------------------------------

        // COMBINING LOGICAL OPERATORS
        // Logical operators are often combined to handle more realistic decisions.
        int score = 85;
        boolean hasExtraCredit = false;
        boolean passed = score >= 60 || hasExtraCredit;
        System.out.println(passed); // true
    }
}
