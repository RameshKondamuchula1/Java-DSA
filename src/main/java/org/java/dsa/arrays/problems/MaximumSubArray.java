package org.java.dsa.arrays.problems;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {4,2,3,-3,-6,6,8,7,-5};
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for(int i = 1; i < arr.length-1;i++) {
            if (currentMax < 0) {
                currentMax = 0;
            }
            currentMax = currentMax + arr[i];
            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }
        }
        System.out.println("Max Sum is : " + maxSoFar);
    }
}
