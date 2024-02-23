package com.learn.dsa.array;

import java.util.HashSet;

public class RemoveDuplicates {

    private static void removeDuplicatesBruteforce(int[] arr, int n){
        /*
            Time Complexity: n
            Space Complexity: n+m where n is length of input array, m is set of unique element
         */
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for(int val: set){
            System.out.println(val);
        }
    }

    private static void removeDuplicatedOptimal(int[] arr, int n){
        /*
            Time Complexity: n
            Space Complexity: 1
         */
        int i = 0;
        for(int j = 0; j < n; j++){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }
        for(int j = 0; j <=i; j++){
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,2, 2, 3, 4, 4, 5, 6,6, 7 };
        int n = arr.length;
        removeDuplicatesBruteforce(arr, n);
        removeDuplicatedOptimal(arr, n);
    }
}
