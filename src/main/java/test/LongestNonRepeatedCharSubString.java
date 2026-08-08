package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatedCharSubString {
    public static void main(String[] args) {
        String s = "1R1T7";
        System.out.println("LongestNonRepeatedCharSubString: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
        String answer = null;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                index = map.get(c) + 1;
            }
            map.put(c, i);
            maxLength = Math.max(maxLength, i - index + 1);// Always calculates Current String length of
                                                           // non-repeated substring index
            answer = s.substring(index, index + maxLength);
        }

        System.out.println("MaxLength: " + maxLength + " for SubString: " + answer);
        return maxLength;
    }
}
