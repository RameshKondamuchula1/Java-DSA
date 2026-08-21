package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxRepeatedNumberOrChar {
    public static void main(String[] args) {

        // Fix: Convert the String into a Character object array
        Character[] charArray = "abababaabbbb".chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        // Test with Characters
        System.out.println(maxRepeated(charArray));

        // Test with Numbers (to prove your generic method works!)
        Integer[] numArray = {1, 3, 3, 2, 1, 3, 5};
        System.out.println(maxRepeated(numArray));

        List<String> list = new ArrayList<>();
        list.add("ram");
        list.add("mansi");
        list.add("meenu");
        list.add("mansi");
        list.add("meenu");
        list.add("meenu");
        System.out.println(maxRepeated(list.toArray()));
    }

    public static <T> String maxRepeated(T[] t) {

        Map<T, Integer> map = new HashMap<>();
        for(T t1: t) {
            map.put(t1, map.getOrDefault(t1, 0) + 1);
        }

        T max = null;
        int maxCount = 0;

        for(Map.Entry<T, Integer> e: map.entrySet()) {
            if(e.getValue() > maxCount) {
                max = e.getKey();
                maxCount = e.getValue();
            }
        }

        return "Max repeated element: " + max + ", repeated : " + maxCount + " times";
    }
}
