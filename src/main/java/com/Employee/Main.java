package com.Employee;

public class Main {
    public static void main(String[] args) {
        // Test cases
        testMaxOfThree(5.5f, 2.2f, 3.3f); // Max is the first number
        testMaxOfThree(2.1f, 7.4f, 4.0f); // Max is the second number
        testMaxOfThree(1.0f, 3.5f, 8.8f); // Max is the third number
    }

    public static void testMaxOfThree(float a, float b, float c) {
        float max = maxOfThree(a, b, c);
        System.out.println("Max of " + a + ", " + b + ", " + c + " is: " + max);
    }

    public static float maxOfThree(float a, float b, float c) {
        float max = a; // Assume a is the maximum
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}