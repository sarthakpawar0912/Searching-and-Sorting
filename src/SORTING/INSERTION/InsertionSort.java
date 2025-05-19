package SORTING.INSERTION;

import java.util.Arrays;

public class InsertionSort {
    // Constructor for the InsertionSort class
    public InsertionSort() {
    }

    // Main method to test the insertion sort implementation
    public static void main(String[] args) {
        // Initialize an array with unsorted integers
        int[] arr = new int[]{4, 5, 1, 2, 3};
        // Call the insertion sort function to sort the array
        insertion(arr);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Function to perform insertion sort on the input array
    static void insertion(int[] arr) {
        // Iterate through the array starting from index 0 to second-to-last element
        for(int i = 0; i < arr.length - 1; ++i) {
            // Start from the element next to index i and move backward
            for(int j = i + 1; j > 0; --j) {
                // Compare the current element with the previous element
                if(arr[j] < arr[j-1]) {
                    // If current element is smaller, swap it with the previous element
                    swap(arr, j, j-1);
                } else {
                    // If current element is not smaller, break the inner loop
                    // because the left side is already sorted
                    break;
                }
            }
            // Optional: Uncomment to print the array after each iteration of outer loop
            // System.out.println(Arrays.toString(arr));
        }
    }

    // Helper function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        // Store the value at index i in a temporary variable
        int temp = arr[i];
        // Assign the value at index j to index i
        arr[i] = arr[j];
        // Assign the temporary value to index j
        arr[j] = temp;
    }
}