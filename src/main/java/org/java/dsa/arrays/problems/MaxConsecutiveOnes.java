package org.java.dsa.arrays.problems;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {1,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1};

        System.out.println("Answer is : " + maxConsecutiveOnes(arr));
    }

    static int maxConsecutiveOnes(int[] arr) {
        int maxCountOnes = 0;
        int currentCountOnes = 0;

        for(int i = 0; i<arr.length;i++) {
            if(arr[i] == 1) {
                currentCountOnes++;
                maxCountOnes = Math.max(maxCountOnes, currentCountOnes);
            } else {
                maxCountOnes = Math.max(maxCountOnes, currentCountOnes);
                currentCountOnes = 0;
            }
        }
        return maxCountOnes;
    }
}
