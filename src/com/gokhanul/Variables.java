package com.gokhanul;

public class Variables {

    public static void main(String[] args) {

        // In Java, a variable is declared by writing, name,
        // and optionally assigning a value with the assignment operator.
        // Example:
        int number = 3;

        // Java has 8 primitive data types used to store simple values.
        // Examples:

        // INTEGER -> stores whole numbers
        int age = 25;
        int score = 100;
        int itemsInCart = 3;

        // DOUBLE -> stores numbers with decimals
        double price = 52.99;
        double height = 1.75;
        double weight = 20.54;

        // CHAR -> stores one single character using single quotes
        char grade = 'A';
        char symbol = '@';
        char player = 'X';

        // BOOLEAN -> stores only two values: true or false
        boolean gameOver = false;
        boolean isJavaFun = true;
        boolean hasLicense = true;

        // BYTE -> stores very small numbers
        byte age1 = 5;
        byte round = 2;
        byte level = -9;

        // SHORT -> stores small whole numbers (bigger than byte)
        short year = 2025;
        short distance = 300;
        short pages = 90;

        // LONG -> stores very large whole numbers and must end with L
        long population = 8000000021455L;
        long fileSize = 549634445936164L;
        long distanceToSun = 149600000000L;

        // FLOAT -> stores decimal numbers (less precise than double) and must and with F
        float price1 = 9.99F;
        float height1 = 1.75F;
        float speed = 88.5F;

        // The print statement It prints text or values to the console
        // so you can see the program’s output.
        // Example:
        System.out.println("JAVA");

        // Variables store values, and you can change those values anytime
        // using the assignment operator (=).
        // Example:
        byte totalAge = 5;
        totalAge = 25; // updated variable value to 25
        System.out.println(totalAge);

        // Using variables in calculation
        // Variables can be used together in expressions.
        // Here, a and b are added, and the result is stored in sum
        // Example:
        int a = 29;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);

        // This line declares an int variable named population and assigns it
        // a readable large number using underscores, which do not affect the actual value.
        // Example:
        int population1 = 234_567_890;
        System.out.println(population1);


        // Non-primitive types
        // In Java are data types that store references to objects, not the actual values themselves.
        // Using Underscores in Numeric Values
        // Example:

        // STRING
        // String is a non-primitive type used to store text.
        // It stores a reference to a String object.
        // Example:
        String name = "Mark";
        System.out.println(name);   // prints the current value

        // Reassigning a new value to the String variable
        name = "Alex";
        System.out.println(name);   // prints the updated value


        // ARRAY
        // Arrays are used to store multiple values of the same data type in a single variable.
        // An array groups multiple values of the same type into one variable.
        int[] numbers = {1, 2, 3};

        // Accessing a value using its index (index starts at 0)
        System.out.println(numbers[0]); // prints 1

        // Changing a value inside the array
        numbers[1] = 10;
        System.out.println(numbers[1]); // prints 10


        // OBJECT (CLASS)
        // Objects are instances of a class that represent real-world entities and hold their own data.
        // An object is created from a class and stores values in its instance variables
        // while allowing access to the class’s behavior.
        //Example:
        //Person person = new Person();
        //An object is a specific instance of a class that contains its own data and behavior.

        // Creating an object from the Person class
        // Example:
        //Person person = new Person();

        // Assigning values to the object's variables
        // person.name = "John";
        // person.age = 25;

        // Accessing object data
        // System.out.println(person.name + " is " + person.age + " years old.");

        // This class represents a real-world object
        class Person {

            // Instance variables
            // Instance variables are variables that belong to an object, and each object has its own copy of them.
            // They are declared inside a class (but outside methods) and store the state or data of an object.
            String name;
            int age;
        }
    }
}
