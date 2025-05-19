package SEARCHING.LINEAR;
import java.util.Scanner;

// Class to demonstrate linear search algorithm
public class LinearSearchMain {

    // Method to perform linear search on an array
    // Takes an array and a key to search for, returns index or -1
    public static int LinearSearch(int[] arr, int key) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches the key
            if (arr[i] == key) {
                return i; // Return index where key is found
            }
        }
        // If key is not found, return -1
        return -1;
    }

    // Main method to test linear search with user input
    public static void main(String[] args) {
        // Create a sample array with numbers 1 to 10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number to search for
        System.out.println("Enter the element to be searched : ");
        // Read the user’s input as an integer
        int key = sc.nextInt();
        // Call LinearSearch to find the key’s index
        int result = LinearSearch(arr, key);
        // Check if key was found (result != -1)
        if (result == -1) {
            // If not found, print message
            System.out.println("Element not found");
        } else {
            // If found, print the index
            System.out.println("Element found at index " + result);
        }

        // Commented-out section for hardcoded testing
        // Defines a fixed key (10) to search in the array
//        int key = 10;
        // Calls LinearSearch with hardcoded key
//        int result = LinearSearch(arr, key);
        // Checks if key was found
//        if (result == -1) {
        // Prints if not found
//            System.out.println("Element not found");
        // Prints index if found
//        } else {
//            System.out.println("Element found at index " + result);
//        }
    }
}