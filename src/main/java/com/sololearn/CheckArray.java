package com.sololearn;

public class CheckArray {
    public static void main(String[] args) {
        // What is the output of this code?
        int[] arr= new int[5];
        int x = arr.length - 3;
        arr[x] = 4;
        arr[++x] = 6;
        if (arr.length > 5) //always false
            System.out.print(arr[arr.length - 2]);
        else
            System.out.print(arr[x]); // Output: 6
    }
}
