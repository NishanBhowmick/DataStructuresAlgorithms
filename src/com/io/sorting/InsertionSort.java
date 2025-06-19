package com.io.sorting;

// Time: O(n^2)
// Space: O(1)

public class InsertionSort {
    public static void main(String args[]) {
        int[] arr = {-5, 3, 2, 1, 9, -3, -3, 7, 2, 2, 4};
        int n = arr.length;
        int i,j,temp;

        for(i=1;i<n;i++){
            for(j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                } else{
                    break;
                }
            }
        }
        for(i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
