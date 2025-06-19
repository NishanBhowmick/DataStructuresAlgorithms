package com.io.sorting;

// Time: O(n log n)
// Space: O(n)

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {-5, 3, 2, 1, 9, -3, -3, 7, 2, 2, 4};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive function to sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two halves
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[]
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[]
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
