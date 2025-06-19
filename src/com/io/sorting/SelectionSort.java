package com.io.sorting;

// Time: O(n^2)
// Space: O(1)

public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = {-5, 3, 2, 1, 9, -3, -3, 7, 2, 2, 4};
        int n = arr.length;
        int i,j,t,temp;

        for(i=0;i<n;i++){
            t=i;
            for(j=i+1;j<n;j++) {
                if(arr[j] < arr[t]){
                    t=j;
                }
            }
            //swapping using XOR
            temp = arr[t];
            arr[t] = arr[i];
            arr[i] = temp;
        }
        for(i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
