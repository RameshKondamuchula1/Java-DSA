package org.java.dsa.arrays.problems;

import java.util.Arrays;

public class ProductOfArrayExceptItSelf {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,6};

        int[] left =  new int[arr.length];
        int[] right =  new int[arr.length];

        int[] answer =  new int[arr.length];
        int n = arr.length;

        left[0] = 1;
        right[n - 1] = 1;

        for(int i = 1; i < arr.length;i++) {
            left[i] = left[i-1] * arr[i-1];
        }

        for(int i = n-2; i >= 0;i--) {
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i = 0; i < arr.length;i++) {
            answer[i] = left[i] * right[i];
        }
        // Each for loop iterating N times -> O(N+N+N) = O(3N) ** Loops are not nested , We use Addition for TC **
        // Post removal of constants the TC is O(N)
        System.out.println(" Answer is : " + Arrays.toString(answer));
    }
}
