package com.learn.dsa.array;

import java.util.Arrays;

public class LargestElement {
    public static void findLargestElementBruteForce(int[] arr, int n){
        /*
            Time Complexity: n log n (Quick sort takes n log n to sort the data)
            Space complexity: 1
         */
        if(n < 1) return;
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }

    public static void findLargestElementOptimal(int[] arr, int n){
        /*
            Time Complexity: n (As we iterate array only once)
            Space Complexity: 1
         */
        if(n < 1) return;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, arr[i]);
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int [] arr = {2, 3, 1, 9, 8, 4, 2, 5};
        int n = arr.length;
        findLargestElementBruteForce(arr, n);
        findLargestElementOptimal(arr, n);
    }
}
