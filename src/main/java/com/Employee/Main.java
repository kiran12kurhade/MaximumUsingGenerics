package com.Employee;

public class Main {
    public static void main(String[] args) {
        // Test cases
        testMaxOfThree("Apple", "Peach", "Banana"); // Max is the first string
        testMaxOfThree("Orange", "Peach", "Banana"); // Max is the second string
        testMaxOfThree("Grape", "Apple", "Banana"); // Max is the third string
    }

    public static void testMaxOfThree(String a, String b, String c) {
        String max = maxOfThree(a, b, c);
        System.out.println("Max of \"" + a + "\", \"" + b + "\", \"" + c + "\" is: \"" + max + "\"");
    }

    public static String maxOfThree(String a, String b, String c) {
        String max = a; // Assume a is the maximum
        if (b.compareTo(max) > 0) { // Compare b with max
            max = b;
        }
        if (c.compareTo(max) > 0) { // Compare c with max
            max = c;
        }
        return max;
    }
}