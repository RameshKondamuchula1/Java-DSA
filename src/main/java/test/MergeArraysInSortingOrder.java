package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeArraysInSortingOrder {

    public static void main(String[] args) {

        int[] arr = {9,0,3,6,8};
        int[] arr2 = {10,1,4,7,5,2};
       // System.out.println("Answer With Streams: " + Arrays.toString(mergeArraysWithStreams(arr, arr2)));

        System.out.println("Answer With loops: " + Arrays.toString(mergeArrays(arr, arr2)));
    }


    //With Streams -- IntStream
    public static int[] mergeArraysWithStreams(int[] arr, int[] arr2) {
        int [] answer;
        if(arr == null || arr.length == 0) {
            answer = arr2;
            return answer;
        }

        if(arr2 == null || arr2.length == 0) {
            answer = arr;
            return answer;
        }
        answer = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).sorted().toArray();

        return answer;
    }

    //With loops
    public static int[] mergeArrays(int[] arr, int[] arr2) {
        int [] answer = new int[arr.length+arr2.length];

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        int index = 0;

        while(i<arr.length && j<arr2.length) {
            if(arr[i] < arr2[j]) {
                answer[index]=arr[i];
                i++;
            } else {
                answer[index]=arr2[j];
                j++;
            }
            index++;
        }

        while(i<arr.length) {
            answer[index]=arr[i];
            index++;
            i++;
        }

        while(j<arr2.length) {
            answer[index]=arr2[j];
            index++;
            j++;
        }

        return answer;
    }
}
