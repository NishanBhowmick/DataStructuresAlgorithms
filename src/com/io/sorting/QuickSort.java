package com.io.sorting;

// Time: O(n log n) on average
// Space: O(log n) due to recursive stack

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {-5, 3, 2, 1, 9, -3, -3, 7, 2, 2, 4};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing the last element as the pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the pivot index
    }
}
