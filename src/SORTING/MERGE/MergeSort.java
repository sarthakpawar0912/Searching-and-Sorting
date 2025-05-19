package SORTING.MERGE;

import java.util.Arrays;

public class MergeSort {

    // Function to perform merge sort on the array from index start to end
    public static void mergeSort(int[] arr, int start, int end) {
        // Base case: if start is greater than or equal to end, the partition
        // is invalid or has only one element, so return
        if (start >= end) {
            return;
        }

        // Find the middle point to divide the array into two equal partitions
        // Using start + (end - start) / 2 avoids integer overflow
        int mid = start + (end - start) / 2;

        // Recursively sort the left partition (from start to mid)
        mergeSort(arr, start, mid);
        // Recursively sort the right partition (from mid + 1 to end)
        mergeSort(arr, mid + 1, end);

        // Create a temporary array to hold the merged result of both partitions
        // Size is end - start + 1 to accommodate all elements in the range
        int[] temp = new int[end - start + 1];

        // Merge the two sorted partitions into the temp array
        // i: index for left partition (starts at start)
        // j: index for right partition (starts at mid + 1)
        // k: index for temp array (starts at 0)
        int i = start, j = mid + 1, k = 0;

        // Compare elements from both partitions and copy the smaller one to temp
        // Continue until one of the partitions is fully processed
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                // If element in left partition is smaller, copy it to temp
                temp[k++] = arr[i++];
            } else {
                // If element in right partition is smaller or equal, copy it to temp
                temp[k++] = arr[j++];
            }
        }

        // Copy any remaining elements from the left partition (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Copy any remaining elements from the right partition (if any)
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements from temp back to the original array
        // Start from index start in the original array
        for (i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }

    // Main method to test the merge sort implementation
    public static void main(String[] args) {
        // Initialize an array with unsorted integers
        int[] arr = {12, 34, 56, 76, 89, 2, 34};
        // Print the array before sorting
        System.out.println("Merge Sort");
        System.out.println("Before: " + Arrays.toString(arr));
        // Call mergeSort to sort the entire array (from index 0 to length - 1)
        mergeSort(arr, 0, arr.length - 1);
        // Print the array after sorting
        System.out.println("After: " + Arrays.toString(arr));
    }
}