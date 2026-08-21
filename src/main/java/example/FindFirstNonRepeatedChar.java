package example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {

        String input = "hheellooggttzyyuuiioolla";
        System.out.println("Non Rep char: " + nonRepeatedChar(input));

    }

    static Character nonRepeatedChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> e: map.entrySet()) {
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return null;
    }
}
