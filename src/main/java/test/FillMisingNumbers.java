package test;

import java.util.*;

public class FillMisingNumbers {

    public static void main(String[] args) {

        int[] arr = {4,3,2,8,2,3,1};
        //int[] arr = {1,1};
        System.out.println("Missing Numbers: " + Arrays.toString(fillMissingNumbers(arr)));

        int[] arr2 = {3,0,1};
        System.out.println("Only Missing Number: " +onlyMissingNumber(arr2));
    }

    // This
    public static Object[] fillMissingNumbers(int[] arr) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int num: arr) {
            set.add(num);
        }
          // If range [0,n] i=0 or [1,n] i=1
        for(int i =1;i <= arr.length;i++) {
            if(!set.contains(i)) list.add(i);
        }

        return list.toArray();
    }

   /* Given an array 'nums' containing 'n' distinct numbers in the range [0, n],
   return the only number in the range that is missing from the array.*/

    public static int onlyMissingNumber(int[] arr) {
        int sum = 0;
        int rangeSum = (arr.length * (arr.length + 1))/2;
        for(int num: arr) {
            sum +=num;
        }

        return rangeSum - sum;
    }

    // This
    public static Object[] fillMissingNumbersSorted(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < arr.length -1; i++) {//O(N*M)
            int current = arr[i];
            int next = arr[i+1];
            if((current+1) != next){
                while((current+1) < next) {
                    list.add(current+1);
                    current++;
                }
            }
        }

        return list.toArray();
    }
}
