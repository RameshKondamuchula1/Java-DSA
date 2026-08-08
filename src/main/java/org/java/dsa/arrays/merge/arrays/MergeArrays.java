package org.java.dsa.arrays.merge.arrays;

import java.util.Arrays;
// Merge Sorted arrays in sorted order
public class MergeArrays {

    public static void main(String[] args) {
        mergeArrays();
    }

    static void mergeArrays() {
        int[] arr1 = {4,7,9,11,16,20};
        int[] arr2 = {0,2,5,10,12,13,14,15};
        int i =0,j = 0;
        int pos = 0;
        int[] res = new int[arr1.length+arr2.length];

        // TC is O(M+N)
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                res[pos] = arr1[i];
                i++;
            } else {
                res[pos] = arr2[j];
                j++;
            }
            pos++;
        }

       // adding remaining elements of arr into mergedArray, if any.
        while (i < arr1.length) {
            res[pos] = arr1[i];
            i++;
            pos++;
        }
        // adding remaining elements of arr2 into mergedArray, if any.
        while (j < arr2.length) {
            res[pos] = arr2[j];
            j++;
            pos++;
        }

        System.out.println("Result: " + Arrays.toString(res));
    }
}
