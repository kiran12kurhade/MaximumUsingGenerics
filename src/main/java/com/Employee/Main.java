package com.Employee;

public class Main {
    public static void main(String[] args) {
        // Test cases for Integers
        testMaxOfThree(5, 2, 3); // Max is the first number
        testMaxOfThree(2, 7, 4); // Max is the second number
        testMaxOfThree(1, 3, 8); // Max is the third number

        // Test cases for Floats
        testMaxOfThree(5.5f, 2.2f, 3.3f); // Max is the first number
        testMaxOfThree(2.1f, 7.4f, 4.0f); // Max is the second number
        testMaxOfThree(1.0f, 3.5f, 8.8f); // Max is the third number

        // Test cases for Strings
        testMaxOfThree("Apple", "Peach", "Banana"); // Max is the second string
        testMaxOfThree("Orange", "Peach", "Banana"); // Max is the second string
        testMaxOfThree("Grape", "Apple", "Banana"); // Max is the first string
    }

    // Generic method to find the maximum of three elements
    public static <T extends Comparable<T>> T maxOfThree(T a, T b, T c) {
        T max = a; // Assume a is the maximum
        if (b.compareTo(max) > 0) { // Compare b with max
            max = b;
        }
        if (c.compareTo(max) > 0) { // Compare c with max
            max = c;
        }
        return max;
    }

    // Test method for the generic method
    public static <T extends Comparable<T>> void testMaxOfThree(T a, T b, T c) {
        T max = maxOfThree(a, b, c);
        System.out.println("Max of " + a + ", " + b + ", " + c + " is: " + max);
    }
}