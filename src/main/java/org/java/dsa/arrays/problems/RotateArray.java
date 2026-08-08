package org.java.dsa.arrays.problems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7,8,9,10};
        rotateArray(arr, 15);
        System.out.println(" Answer is : " + Arrays.toString(arr));
    }

    static void rotateArray(int[] arr, int k) {

        int n = arr.length;
        int minK= k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, minK-1);
        reverse(arr, minK, n-1);
    }

    static void reverse(int[] arr, int start, int end) {
        int i=start, j=end;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
