package com.io.sorting;

// Time: O(n^2)
// Space: O(1)

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {-5,3,2,1,9,-3,-3,7,2,2,4};
        int n = arr.length;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=1; i< n; i++){
                if(arr[i-1] > arr[i]){
                    flag = true;
                    //swapping using XOR
                    arr[i-1] = arr[i-1] ^ arr[i];
                    arr[i] = arr[i-1] ^ arr[i];
                    arr[i-1] = arr[i-1] ^ arr[i];
                }
            }
        }
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
