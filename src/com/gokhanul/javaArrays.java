package com.gokhanul;

import java.util.Arrays;

public class javaArrays {

    public static void main(String[] args) {

        // ARRAY
        // An array in Java is a data structure that stores multiple values of the same data type
        // in a single variable. Each value in an array is stored at a specific position called an index,
        // which starts with 0.
        // Arrays have a fixed size once you create an array, you cannot change how many elements it can hold.
        // Example:

        // 1. Declare array with a fixed size, then assign values
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("First element (numbers): " + numbers[0] + " ,third element: " + numbers[2]);

        // 2. Declare and initialize with values
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println("First element (numbers2): " + numbers2[0] + " ,third element: " + numbers2[2]);

        //----------------------------------------------------------------------------------------------------

        // Using Arrays.toString() to Display an Array
        // By default, printing an array directly does not show its contents.
        // Arrays.toString() converts the array into a readable string so you can see all elements at once.
        int[] numbers3 = {2, 4, 6, 8, 10};
        System.out.println(numbers3); // [I@2a84aee7 (memory)
        System.out.println(Arrays.toString(numbers3)); // [2, 4, 6, 8, 10] (elements)

        //----------------------------------------------------------------------------------------------------

        // Finding the Length of an Array with Arrays.length()
        // The length property tells you how many elements an array can hold.
        // It is commonly used in loops to avoid going out of bounds.
        String[] colors = {"Red", "Blue", "Green", "Yellow"};
        System.out.println("Array length: " + colors.length);

        //----------------------------------------------------------------------------------------------------

        // Sorting an Array with Arrays.sort()
        // Arrays.sort() arranges the elements of an array in ascending order.
        // This commonly used before searching or displaying ordered data.
        int[] numbers4 = {40, 10, 30, 20};
        Arrays.sort(numbers4);
        System.out.println(Arrays.toString(numbers4));

        //----------------------------------------------------------------------------------------------------

        // Searching in an Array with Arrays.binarySearch()
        // Arrays.binarySearch() is used to quickly find the index of an element.
        // The array must be sorted fist, or the result will be in correct.
        int[] numbers5 = {10, 20, 30, 40};
        int index = Arrays.binarySearch(numbers5, 30);
        System.out.println("Index of 30: " + index);

        //----------------------------------------------------------------------------------------------------

        // Copying an Array with Arrays.copyOf()
        // Arrays.copyOf() creates a new array by copying an existing one.
        // This is useful when you want to modify a copy without changing the original
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length); // original.length is used when you want a full, exact copy
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));

        //----------------------------------------------------------------------------------------------------

        // MULTI DIMENSIONAL ARRAY
        // This example shows how to create a 2D array by initializing values directly and by defining the size first.
        // 1. Initialize with values
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 2. Define size, then assign values
        int[][] matrix2 = new int[2][3];
        matrix2[0][0] = 10;
        matrix2[0][1] = 20;
        matrix2[0][2] = 30;
        matrix2[1][0] = 40;
        matrix2[1][1] = 50;
        matrix2[1][2] = 60;

        System.out.println(matrix1);
        System.out.println(matrix2);

        //----------------------------------------------------------------------------------------------------

        // Using Arrays.deepToString()
        // Arrays.toString() does not work correctly for multidimensional arrays.
        // Arrays.deepToString is used to display all nested array values.
        int[][] matrix3 = {
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println(Arrays.deepToString(matrix3));

    }
}
