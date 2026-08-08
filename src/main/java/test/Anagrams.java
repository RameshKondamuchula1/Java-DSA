package test;

import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {

    public static void main(String[] args) {
        String[] input = { "aba"
                ,
                "baa"
                ,
                "acb"
                ,
                "ahs"
                ,
                "ash"
                ,
                "abc"
                ,
                "aab"
                ,
                "cba"
        , "aaa"};

        System.out.println(" Anagrams " + anagramsList(input));
        System.out.println("Non Anagrams " + nonAnagramsList(input));
        System.out.println("============= Both Results together =============== ");
        System.out.println("Non Anagrams " + bothList(input));
    }

    static Map<String, List<String>> anagramsList(String[] input) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str: input) {// O(N)
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            anagramMap.computeIfAbsent(key, s ->new ArrayList<>()).add(str);
        }

        return anagramMap.entrySet().stream().filter(e -> e.getValue().size() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    static Map<String, List<String>> nonAnagramsList(String[] input) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str: input) {// O(N * M Log M)
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            anagramMap.computeIfAbsent(key, s ->new ArrayList<>()).add(str);
        }

        return anagramMap.entrySet().stream().filter(e -> e.getValue().size() == 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    static Map<String, Map<String, List<String>>> bothList(String[] input) {

        Map<String, List<String>> anagramMap = new HashMap<>();
        Map<String, Map<String, List<String>>> bothList = new HashMap<>();

        for(String str: input) {// O(N * M Log M)
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            anagramMap.computeIfAbsent(key, s ->new ArrayList<>()).add(str);

        }

        String nonAnagrams = "nonAnagrams";
        String anagrams = "anagrams";
        // 2. Initialize the nested inner maps to prevent NullPointerExceptions
        bothList.put(anagrams, new HashMap<>());
        bothList.put(nonAnagrams, new HashMap<>());

        for(Map.Entry<String, List<String>> entry: anagramMap.entrySet()) {//O(logN)
            if(entry.getValue().size() == 1) {
                // Add non anagrams to Map
                bothList.get(nonAnagrams).put(entry.getKey(), entry.getValue());
            } else {
                // Add anagrams to Map
                bothList.get(anagrams).put(entry.getKey(), entry.getValue());
            }
        }

        return bothList;
    }
}
