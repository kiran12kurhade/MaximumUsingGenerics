package com.Employee;

// Generic class MaxOfThree to hold three variables of a generic type
public class MaxOfThree<T extends Comparable<T>> {
    private T a;
    private T b;
    private T c;

    // Parameterized constructor
    public MaxOfThree(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Instance method to call the static maxOfThree method
    public T testMaximum() {
        return maxOfThree(a, b, c);
    }

    // Static method to find the maximum of three elements
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

    // Static method to test the maxOfThree functionality
    public static <T extends Comparable<T>> void testMaxOfThree(T a, T b, T c) {
        T max = maxOfThree(a, b, c);
        System.out.println("Max of " + a + ", " + b + ", " + c + " is: " + max);
    }

    public static void main(String[] args) {
        // Test cases for Integers using static method
        testMaxOfThree(5, 2, 3); // Max is the first number
        testMaxOfThree(2, 7, 4); // Max is the second number
        testMaxOfThree(1, 3, 8); // Max is the third number

        // Test cases for Floats using static method
        testMaxOfThree(5.5f, 2.2f, 3.3f); // Max is the first number
        testMaxOfThree(2.1f, 7.4f, 4.0f); // Max is the second number
        testMaxOfThree(1.0f, 3.5f, 8.8f); // Max is the third number

        // Test cases for Strings using static method
        testMaxOfThree("Apple", "Peach", "Banana"); // Max is the second string
        testMaxOfThree("Orange", "Peach", "Banana"); // Max is the second string
        testMaxOfThree("Grape", "Apple", "Banana"); // Max is the first string

        // Test case using the generic MaxOfThree class
        MaxOfThree<Integer> integerMax = new MaxOfThree<>(3, 7, 5);
        System.out.println("Using MaxOfThree class: Max of 3, 7, 5 is: " + integerMax.testMaximum());

        MaxOfThree<String> stringMax = new MaxOfThree<>("Apple", "Peach", "Banana");
        System.out.println("Using MaxOfThree class: Max of Apple, Peach, Banana is: " + stringMax.testMaximum());

        MaxOfThree<Float> floatMax = new MaxOfThree<>(3.5f, 7.8f, 5.0f);
        System.out.println("Using MaxOfThree class: Max of 3.5, 7.8, 5.0 is: " + floatMax.testMaximum());
    }
}
