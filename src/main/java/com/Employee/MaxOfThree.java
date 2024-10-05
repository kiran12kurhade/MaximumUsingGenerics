package com.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaxOfThree<T extends Comparable<T>> {
    private List<T> elements;

    // Parameterized constructor accepting a variable number of elements
    @SafeVarargs
    public MaxOfThree(T... elements) {
        this.elements = Arrays.asList(elements);
    }

    // Instance method to find the maximum element using the static max method
    public Optional<T> testMaximum() {
        return max(elements);
    }

    // Static method to find the maximum element in a list using sorting and Optional
    public static <T extends Comparable<T>> Optional<T> max(List<T> elements) {
        // Handle case where the list might be empty
        if (elements == null || elements.isEmpty()) {
            return Optional.empty();
        }
        // Sort the list in natural order and return the last element (which is the largest)
        Collections.sort(elements);
        return Optional.ofNullable(elements.get(elements.size() - 1));
    }

    // Static method to test the max functionality
    @SafeVarargs
    public static <T extends Comparable<T>> void testMax(T... elements) {
        Optional<T> max = max(Arrays.asList(elements));
        if (max.isPresent()) {
            System.out.println("Max of " + Arrays.toString(elements) + " is: " + max.get());
        } else {
            System.out.println("The list is empty, no maximum value.");
        }
    }

    public static void main(String[] args) {
        // Test cases for Integers
        testMax(5, 2, 3, 9, 1); // Max is 9
        testMax(2, 7, 4, 12, 5); // Max is 12
        testMax(); // No elements, should handle empty list

        // Test cases for Floats
        testMax(5.5f, 2.2f, 3.3f, 1.1f); // Max is 5.5
        testMax(2.1f, 7.4f, 4.0f, 9.9f); // Max is 9.9
        testMax(); // No elements, should handle empty list

        // Test cases for Strings
        testMax("Apple", "Peach", "Banana", "Mango"); // Max is Peach
        testMax("Orange", "Peach", "Banana", "Grape"); // Max is Peach
        testMax(); // No elements, should handle empty list

        // Test case using the generic MaxOfThree class
        MaxOfThree<Integer> integerMax = new MaxOfThree<>(3, 7, 5, 10, 1);
        System.out.println("Using MaxOfThree class: Max of [3, 7, 5, 10, 1] is: " + integerMax.testMaximum().orElse(null));

        MaxOfThree<String> stringMax = new MaxOfThree<>("Apple", "Peach", "Banana", "Mango");
        System.out.println("Using MaxOfThree class: Max of [Apple, Peach, Banana, Mango] is: " + stringMax.testMaximum().orElse(null));

        MaxOfThree<Float> floatMax = new MaxOfThree<>(3.5f, 7.8f, 5.0f, 9.0f, 2.2f);
        System.out.println("Using MaxOfThree class: Max of [3.5, 7.8, 5.0, 9.0, 2.2] is: " + floatMax.testMaximum().orElse(null));
    }
}
