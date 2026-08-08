package test;

import java.util.*;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {

        String input = "1212345678";

        System.out.println("FindFirstNonRepeatedChar Index: " + firstUniqChar(input));

        System.out.println("FindFirstNonRepeatedChar Index: " + firstUniqChar3(input));
    }

    public static int firstUniqChar(String s) {
        if(s == null || s.isEmpty()) {
            return -1;
        }

        if(s.length() == 1) {
            return 0;
        }

        Optional<Character> charOpt = s.chars()
                .mapToObj(c -> (char) c)
                // Use LinkedHashMap::new to preserve insertion order
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        return charOpt.map(s::indexOf).orElse(-1);
    }

    // This Approach only works lowercase alphabates
    // See the description of the problem, if its mentioned lowercase alphabets then this is he best solution
    public int firstUniqChar2(String s) {
        // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public static int firstUniqChar3(String s) {

        HashMap<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(count.get(ch) == 1) return i;
        }

        return -1;
    }
}
