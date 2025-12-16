package com.gokhanul;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

        // Strings in Java – Full Explanation
        // A String is a non-primitive data type used to store text.
        // In Java, String is a class, and every String is an object.
        // Key characteristics of Strings:
        // Stores text (letters, numbers, symbols)
        // Immutable (cannot be changed after creation)
        // Can call methods on it and can be null
        //Example:
        // Using double quotes (most common)
        String name = "Mark";
        // Using new keyword
        String country = new String("USA");
        // Explanation: Both create Strings, but the first is preferred.

        //-----------------------------------------------------------------------------------------------------

        // Changing a String value
        // Strings connot be modified - a new String is created
        String name1 = "Donald";
        name1 = "Max";
        // here the original "Mark" is not changed, name now points at "Max"

        // Concatenation (joining Strings)
        // combines strings into on string using the + operator or methods
        String firstName = "John";
        String lastName = "Wick";
        String fullName = firstName + " " + lastName;
        // with numbers
        int age = 30;
        System.out.println(fullName + " is " + age + " years old!");

        // Common String methods (very important)
        // length() -> returns the number of characters in a string.
        String text = "Hello";
        int size = text.length(); // 5

        // toUpperCase() / toLowerCase()-> converts text to uppercase or lowercase.
        String word = "Java";
        word.toUpperCase(); // "JAVA"
        word.toLowerCase(); // "java"

        // charAt() -> gets a single character from a string using its index.
        String language = "Java";
        char firstLetter = language.charAt(0); // 'J'

        // contains() -> checks if a string contains specific text.
        String email = "test@gmail.com";
        email.contains("@"); // true

        // equals() ->
        String a = "Java";
        String b = "Java";
        a.equals(b); // true

        //-----------------------------------------------------------------------------------------------------

        // Checking empty or null Strings
        // Empty String
        String emptyCheck = "";
        text.isEmpty();

        // Null check
        String nullCheck = null;
        if (nullCheck == null) {
            System.out.println("No value");
        }

        //-----------------------------------------------------------------------------------------------------

        // Replacing text
        String sentence = "I like Java";
        sentence.replace("Java", "Programming");
        System.out.println(sentence);

        //-----------------------------------------------------------------------------------------------------

        // Splitting text
        String names = "Mark, Alex, John";
        String[] result = names.split(", ");
        System.out.println(Arrays.toString(result));

        //-----------------------------------------------------------------------------------------------------

        // Trimming spaces
        String input = " Hello ";
        input.trim(); // "Hello"

        //-----------------------------------------------------------------------------------------------------

        // String immutability (important concept)
        String concatWord = "Hello";
        concatWord.concat(" Word");
        System.out.println(concatWord); // -> is still "Hello"
        // Explanation: String do not change -> methods return a new String
        // Correct way:
        word = concatWord.concat(" Word"); // "Hello World"
        System.out.println(word);

        // Strings provide many methods to manipulate and work with text,
        // but they are immutable.

    }
}