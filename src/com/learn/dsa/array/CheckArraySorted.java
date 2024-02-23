package com.learn.dsa.array;

public class CheckArraySorted {

    private static boolean isSortedBruteforce(int[] arr, int n){
        /*
            Time Complexity: n2
            Space Complexity: 1
         */
        if(n < 2){
            return true;
        }
        for(int i = 0; i < n -1; i++){
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSortedOptimal(int[] arr, int n){
        /*
            Time Complexity: n
            Space Complexity: 1
         */
        if(n < 2){
            return true;
        }
        for(int i = 0; i < n-1; i++){
           if(arr[i] > arr[i+1]){
               return false;
           }
        }
        return true;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {2, 1, 4, 5, 6, 3};
        int n = arr.length;
        System.out.println(isSortedBruteforce(arr, n));
        System.out.println(isSortedOptimal(arr, n));
        int n1 = arr1.length;
        System.out.println(isSortedBruteforce(arr1, n1));
        System.out.println(isSortedOptimal(arr1, n1));
    }
}
