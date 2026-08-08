package test;

import java.util.Arrays;

public class MinimumUnfairnessArrayOfKLength {
    public static void main(String[] args) {

        int[] array = {7,2,4,6,9};
        int k = 3;

        System.out.println("Minimum Unfairness Array of K length: " + Arrays.toString(minUnfairnessArray(array, k)));

    }

    private static int[] minUnfairnessArray(int[] array, int k) {
        int[] answer = new int[k];

        int minimum = Integer.MAX_VALUE;
        int startIndex = 0;
        Arrays.sort(array);

        for (int i = 0; i < array.length - k; i++) {
            int currentMinimum = array[i+k-1] - array[i];
            if(currentMinimum < minimum) {
                startIndex = i;
                minimum = currentMinimum;
            }
        }

        for (int i = 0;i < k;i++ ){
            answer[i] = array[startIndex];
            startIndex++;
        }

        return answer;
    }
}
