package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeNArraysInSortedOrder {
    public static void main(String[] args) {
        int[] intArray1 = {9,0,3,6,8};
        int[] intArray2 = {10,1,4,7,5,2};
        int[] intArray3 = {-1,-6,11,-7,-5,-2};

        List<int[]> list = new ArrayList<>();
        list.add(intArray1);
        list.add(intArray2);
        list.add(intArray3);

        System.out.println("Merged Arrays: " + Arrays.toString(mergeTwoSortedArrays(intArray1,intArray2)));

        System.out.println("Merged N Arrays: " + Arrays.toString(mergedNArraysSortedOrder(list)));
    }

   static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        int[] answer = new int[arr1.length + arr2.length];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j=0;
        int index = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] < arr2[j]) {
                answer[index++] = arr1[i];
                i++;
            } else {
                answer[index++] = arr2[j];
                j++;
            }

        }
        if ( i < arr1.length) {
            for (int k = i;k<arr1.length;k++) {
                answer[index++] = arr1[k];
            }
        }

       if ( j < arr2.length) {
           for (int k = i;k<arr2.length;k++) {
               answer[index++] = arr2[k];
           }
       }

        return answer;
    }

    static int[] mergedNArraysSortedOrder(List<int[]> list) {
        int[] answer = null;
        for (int[] ints : list) {
            answer = IntStream.concat(IntStream.of(answer != null ? answer : new int[]{}), IntStream.of(ints)).toArray();
        }

        return answer != null ? IntStream.of(answer).sorted().distinct().toArray() : new int[]{};
    }
}
