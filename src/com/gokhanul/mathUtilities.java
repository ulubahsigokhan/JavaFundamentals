package com.gokhanul;

import java.text.NumberFormat;

public class mathUtilities {

    public static void main(String args[]) {

        // ROUNDING NUMBERS WITH Math.round()
        // Math.round() rounds a decimal number to the nearest whole number.
        // Values .5 and above round up; below .5 round down.
        double value = 4.6;
        long result = Math.round(value);
        System.out.println(result); // 5

        //----------------------------------------------------------------------------------------------------

        // ROUNDING DOWN WITH Math.floor
        // Math.floor() always rounds down to the nearest whole number.
        double value2 = 5.2;
        double result2 = Math.floor(value2);
        System.out.println(result2); // 5.0

        //----------------------------------------------------------------------------------------------------

        //ROUNDING UP WITH Math.ceil()
        // Math.ceil() always rounds up to the nearest whole number.
        double value3 = 9.2;
        double result3 = Math.ceil(value3);
        System.out.println(result3); // 10.0

        //----------------------------------------------------------------------------------------------------

        // FINDING THE MAXIMUM VALUE WITH Math.max()
        // Math.max() returns the larger of two numbers.
        int a = 10;
        int b = 32;
        int max = Math.max(a, b);
        System.out.println(max); // 32

        //----------------------------------------------------------------------------------------------------

        // FINDING THE MINIMUM VALUE WITH Math.min()
        // Math.min() returns the smaller of two numbers.
        int c = 23;
        int d = 12;
        int min = Math.min(c, d);
        System.out.println(min); // 12

        //----------------------------------------------------------------------------------------------------

        // GENERATING RANDOM NUMBERS WITH Math.random()
        // Math.random() generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
        // It is commonly scaled to a desired range.
        int randomNumber = (int) (Math.random() *10);
        System.out.println(randomNumber); // 0 - 9

        //----------------------------------------------------------------------------------------------------

        // POWER CALCULATION WITH Math.pow()
        // Math.pow() raises a number to the power of another number.
        double result4 = Math.pow(2,3);
        System.out.println(result4); // 8.0

        //----------------------------------------------------------------------------------------------------

        // SQUARE ROOT WITH Math.sqrt()
        // Math.sport() returns the square root of a number.
        double result5 = Math.sqrt(16);
        System.out.println(result5); // 4.0

        //----------------------------------------------------------------------------------------------------

        // FORMATTING CURRENCY WITH NumberFormat.getCurrencyInstance()
        // NumberFormat.getCurrencyInstance() formats numbers as currency on the default locale(USD in the US),
        // adds the currency symbol, applies correct decimal places, handles commas correctly
        double price = 49.9;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(price)); // $49.90 (US locale)
        // or with Method Chaining
        // System.out.println(NumberFormat.getCurrencyInstance().format(price) $49.90 (US locale)

        //----------------------------------------------------------------------------------------------------

        // PERCENTAGE FORMATTING NumberFormat.getPercentInstance()
        // getPercentInstance() converts a decimal into a percentage automatically;
        double rate = 0.25;
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(rate)); // %25
        // or with Method Chaining
        // System.out.println(NumberFormat.getPercentInstance().format(rate) %25

        //----------------------------------------------------------------------------------------------------

        // CONTROLLING DECIMAL PLACES (COMMON REQUIREMENT)
        // You can control how many decimals are shown using setMinimumFractionDigits() and
        // setMaximumFractionDigits().
        double taxRate = 0.0725;
        NumberFormat percent2 = NumberFormat.getPercentInstance();
        percent2.setMinimumFractionDigits(2);
        System.out.println(percent2.format(taxRate)); // %7.25


    }
}
