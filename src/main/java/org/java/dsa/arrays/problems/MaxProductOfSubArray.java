package org.java.dsa.arrays.problems;

public class MaxProductOfSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4,-10};
        int maxP = arr[0];
        int minP = arr[0];
        int result = arr[0];

        for(int i = 1; i < arr.length; i++) {
           int crrNumber = arr[i];
            if (crrNumber >= 0) {
                maxP = Math.max(crrNumber, crrNumber * maxP);
                minP = Math.min(crrNumber, crrNumber * minP);
            } else {
                int temp = maxP;
                maxP = Math.max(crrNumber ,minP * crrNumber);
                minP = Math.min(crrNumber, temp * crrNumber);
            }

            result = Math.max(minP, maxP);

        }

        System.out.println("Max product of sub array is : " + result);
    }
}
