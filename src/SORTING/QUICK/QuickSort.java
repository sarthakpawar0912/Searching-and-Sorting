package SORTING.QUICK;
import java.util.Arrays;

public class QuickSort {

    // Helper function to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        // Store the value at index i in a temporary variable
        int temp = arr[i];
        // Assign the value at index j to index i
        arr[i] = arr[j];
        // Assign the temporary value to index j
        arr[j] = temp;
    }

    // Function to perform QuickSort on the array from index start to end
    private static void quickSort(int[] arr, int start, int end) {
        // Base case: if partition has one element or is invalid (start >= end), return
        if (start >= end) {
            return;
        }

        // Choose the start element as the pivot
        int pivot = arr[start];
        // i: points to the position where elements <= pivot should go
        int i = start;
        // j: scans the array to find elements to swap
        int j = end;

        // Partition the array around the pivot
        // Detailed Explanation:
        // - We want to rearrange the array so that:
        //   - Elements <= pivot are on the left (from start to some point).
        //   - Elements > pivot are on the right.
        // - i keeps track of the boundary where elements <= pivot end.
        // - j scans from the end to find elements <= pivot to swap with elements > pivot.
        while (i < j) {
            // Move i forward until we find an element > pivot
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            // Move j backward until we find an element <= pivot
            while (j >= start && arr[j] > pivot) {
                j--;
            }
            // If i is still less than j, swap elements at i and j
            // This places a larger element (arr[i]) on the right and a smaller element (arr[j]) on the left
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        // j is now at the position where the pivot should go
        // Swap the pivot (arr[start]) with arr[j]
        swap(arr, start, j);

        // Recursively apply QuickSort to the left partition (start to j-1)
        // All elements in this partition are <= pivot
        quickSort(arr, start, j - 1);
        // Recursively apply QuickSort to the right partition (j+1 to end)
        // All elements in this partition are > pivot
        quickSort(arr, j + 1, end);
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        // Initialize an array with unsorted integers
        int[] arr = {12, 34, 56, 76, 89, 2, 34};
        // Print the array before sorting
        System.out.println("Quick Sort");
        System.out.println("Before: " + Arrays.toString(arr));
        // Call quickSort to sort the entire array (from index 0 to length - 1)
        quickSort(arr, 0, arr.length - 1);
        // Print the array after sorting
        System.out.println("After: " + Arrays.toString(arr));
    }
}