package com.io.sorting;

import java.util.Arrays;

// Time: O(n+k) where k is range of data
// Space: O(k)

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Step 1: Find the maximum value in the array to determine the size of count array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array with size max + 1
        int[] count = new int[max + 1];

        // Step 3: Store the count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Overwrite original array with sorted elements
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}
