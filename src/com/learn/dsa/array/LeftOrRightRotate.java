package com.learn.dsa.array;

public class LeftOrRightRotate {

    private static int[] leftOrRightRotateBruteforce(int[] arr, int n, int k, String rotate){
        /*
            Time Complexity: n
            Space Complexity: n
         */
        if(rotate.equals("left")){
            return leftRotate(arr, n, k);
        }else if(rotate.equals("right")){
            return rightRotate(arr, n, k);
        }
        return arr;
    }

    private static int[] leftRotate(int[] arr, int n, int k){
        if(n == 0)
            return arr;
        k = k % n;
        if(k > n){
            return arr;
        }
        int [] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int i = 0; i < n - k; i++){
            arr[i] = arr[i+k];
        }
        for(int i = n-k; i < n; i++){
            arr[i] = temp[i - n + k];
        }
        return arr;
    }

    private static int[] rightRotate(int[] arr, int n, int k){
        if(n == 0){
            return arr;
        }
        k = k % n;
        if( k > n){
            return arr;
        }
        int[] temp = new int[k];
        for(int i = n-k; i < n; i++){
            temp[i-n+k] = arr[i];
        }
        for(int i = n - k -1; i >=0; i--){
            arr[i+k] = arr[i];
        }
        for(int i = 0; i < k; i++){
            arr[i] = temp[i];
        }
        return arr;
    }

    private static void leftorrightRotateOptimal(int[] arr, int n, int k){
        /*
            Time Complexity: n
            Space Complexity: 1
         */
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int n, int m){
        while(n <= m){
            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
            m--;
            n++;
        }
    }


    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
//        int[] res = leftOrRightRotateBruteforce(arr, n, k, "left");
//        for (int val : res) {
//            System.out.print(val);
//        }
//        System.out.println();
//        int[] res1 = leftOrRightRotateBruteforce(arr, n, k, "right");
//        for (int val : res1) {
//            System.out.print(val);
//        }
//        System.out.println();

        leftorrightRotateOptimal(arr, n, k);
        for (int val : arr) {
            System.out.print(val);
        }
    }
}
