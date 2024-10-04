package com.Employee;

public class Main {
    public static void main(String[] args) {
        testMaxOfThree(5, 2, 3); // Max is the first number
        testMaxOfThree(2, 7, 4); // Max is the second number
        testMaxOfThree(1, 3, 8); // Max is the third number
    }

    public static void testMaxOfThree(int a, int b, int c) {
        int max = maxOfThree(a, b, c);
        System.out.println("Max of " + a + ", " + b + ", " + c + " is: " + max);
    }

    public static int maxOfThree(int a, int b, int c) {
        int max = a; // Assume a is the maximum
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    }
