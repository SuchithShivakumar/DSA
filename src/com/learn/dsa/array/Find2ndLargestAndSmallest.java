package com.learn.dsa.array;

import java.util.Arrays;

public class Find2ndLargestAndSmallest {

    private static int findSecondLargestBruteforce(int[] arr, int n){
        /*
            Time Complexity: n log n  to sort the array, selecting the 2nd largest element is constant after sort
            Space Complexity: 1
         */
        if(n < 2){
            return -1;
        }
        Arrays.sort(arr);
        return arr[n-2];
    }

    private static int findSecondSmallestBruteforce(int[] arr, int n){
        /*
            Time Complexity: nlogn to sort the array, Selecting the 2nd smallest element is constant after sort
            Space Complexity: 1
         */
        if(n < 2){
            return -1;
        }
        Arrays.sort(arr);
        return arr[1];
    }

    private static int findSecondLargestOptimal(int[] arr, int n){
        /*
            Time Complexity: n as we iterate through the array only once to find 2nd largest
            Space Complexity: 1
         */
        if(n < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }

    private static int findSecondSmallestOptimal(int[] arr, int n){
        /*
            Time Complexity:  n as we iterate through the array only once to find 2nd largest
            Space Complexity: 1
         */
        if(n < 2){
            return -1;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }



    public static void main(String[] args) {
        /*
            Problem Statement: Given an array, find the second smallest and second largest element in the array.
            Print ‘-1’ in the event that either of them doesn’t exist.
         */

        int[] arr = {3, 6, 9, 4, 1, 2, 8, 5, 7};
        int n = arr.length;

        System.out.println("2nd largest Bruteforce "+findSecondLargestBruteforce(arr, n));
        System.out.println("2nd smallest Bruteforce "+findSecondSmallestBruteforce(arr, n));
        System.out.println("2nd largest optimal "+findSecondLargestOptimal(arr, n));
        System.out.println("2nd smallest optimal "+findSecondSmallestOptimal(arr, n));

    }
}
