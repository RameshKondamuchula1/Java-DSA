package test;

import java.util.*;

public class UniqueTriplestSumEqualToZero {
    public static void main(String[] args) {

        int[] input = {-1,0,1,2,-1,-4};
        System.out.println("UniqueTriplets: " + uniqueTripletsSumIsZero(input));
    }

    public static List<List<Integer>> uniqueTripletsSumIsZero(int[] input) {
        Set<List<Integer>> ans = new HashSet<>();
        if(input == null || input.length <=2) {
            return new ArrayList<>(ans);
        }
        Arrays.sort(input); // O(NLogN)
        int length = input.length;

        for(int i=0; i < length-2;i++){
             int j = i+1;
             int k = length-1;

             while(j<k) {
                 int sum = input[i] + input[j] + input[k];
                 if(sum == 0) {
                     ans.add(List.of(input[i], input[j++], input[k--]));
                 } else if(sum > 0) {
                     k--;
                 } else {
                     j++;
                 }
             }
        }
        return new ArrayList<>(ans);
    }
}
