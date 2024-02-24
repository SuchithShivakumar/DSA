package com.learn.dsa.array;

public class LeftRotate {

    private static int[] leftRotateBruteForce(int [] arr, int n){
        /*
            Time Complexity: n
            Space Complexity: n
         */
        int [] temp = new int[n];
        for(int i = 1; i < n; i++){
            temp[i - 1] = arr[i];
        }
        temp[n-1] = arr[0];

        return temp;
    }

    private static int[] leftRotateOptimal(int[] arr, int n){
        /*
            TimeComplexity: n
            Space Complexity: 1
         */
        int start = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = start;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5,1,9};
        int n = arr.length;
        int[] res = leftRotateBruteForce(arr, n);
        for(int val : res){
            System.out.print(val);
        }
        System.out.println();

        int[] res1 = leftRotateOptimal(arr, n);
        for(int val : res1){
            System.out.print(val);
        }
        System.out.println();
    }

}
