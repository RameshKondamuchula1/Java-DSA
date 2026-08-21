package example;

import java.util.*;

public class DuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,6,6,7,9,1};
        System.out.println("Duplicates: " + Arrays.toString(duplicates(arr)));
        System.out.println("duplicatesUsingMap: " + Arrays.toString(duplicatesUsingMap(arr)));
    }

    static Object[] duplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i: arr) {
            if(!set.add(i)) {
                list.add(i);
            }
        }
        return list.toArray();
    }

    static Object[] duplicatesUsingMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        return map.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).toArray();
    }
}

