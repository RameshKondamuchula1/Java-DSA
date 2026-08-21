package example;

import java.util.*;

public class PairSumEqualToK {
    public static void main(String[] args) {
        int[] intArray = {1,3,4,6,7};
        int sum = 7;
        System.out.println("Pairs: " + pairsSumK(intArray,sum));
        System.out.println("Pairs Approach2: " + pairsSumKApproach(intArray,sum));
    }


    static Set<List<Integer>> pairsSumK (int[] arr, int k) {
        Set<List<Integer>> pairs = new HashSet<>();
        //Enable this for Descending order
        //arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num: arr) {
            if(map.containsKey(k-num)) {
                if(num!=k) {
                    pairs.add(List.of(k-num,num));
                } else {
                    pairs.add(List.of(num));
                }
            } else {
                map.put(num, k-num);
            }
        }
        return pairs;
    }

    static Set<List<Integer>> pairsSumKApproach (int[] arr, int k) {
        Set<List<Integer>> pairs = new HashSet<>();

        Set<Integer> map = new HashSet<>();
        map.add(0);// Base condition for a number is equal to given number
        for (int num: arr) {
            if(!map.add(k-num)) {
                if(num!=k) {
                    pairs.add(List.of(k-num,num));
                } else {
                    pairs.add(List.of(num));
                }
            } else {
                map.add(num);
            }
        }
        return pairs;
    }
}
