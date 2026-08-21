package example;

import java.util.Arrays;

public class FindTripletsWhoseSumEqualToZero {
    public static void main(String[] args) {
        int[] input = {3,-1,0,1,2,2,-3,-2,-2};
        System.out.println("FindTripletsWhoseSumEqualToZero: " + Arrays.toString(triplets(input)));
    }

    static int[] triplets(int[] arr) {

        Arrays.sort(arr);
        int startIndex = 0;
        for(int i = 0; i < arr.length-2;i++) {
            if(arr[i] + arr[i+1] + arr[i+2] == 0) {
                startIndex = i;
            }
        }

        int[] result = new int[3];
        int index = 0;
        for(int i = startIndex; i<startIndex+3;i++) {
            result[index++] = arr[i];
        }
        // TC = O(N+3) = O(N)
        return result;
    }
}
