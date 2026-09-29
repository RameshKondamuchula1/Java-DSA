package org.java.dsa.arrays.reverse.string;

import java.time.Instant;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println("Reverse of a String Mansi: " + recursiveString("Reverse of a String Mansi"));
        System.out.println(Instant.now());
        System.out.println("Second Approach");
        System.out.println(Instant.now());
        System.out.println("Reverse of a String Mansi: " + reverseString("Reverse of a String Mansi"));
        System.out.println(Instant.now());

        List<Integer> result = new ArrayList();
        Set<Integer> set1 = new HashSet();
        Map<CharSequence, Boolean> map = new HashMap();
    }

    public boolean isAnagram(String s, String t) {

        if(t == null || s == null) {
            return false;
        }

        if(t.length() !=  s.length()) {
            return false;
        }
        Map<String, Boolean> map = new HashMap();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String s1 = new String(sArray);
        String s2 = new String(sArray);

        return Arrays.equals(sArray, tArray);

    }

    //O(N)
    static String reverseString(String str) {
       char[] cArray = str.toCharArray();
       StringBuilder sb = new StringBuilder();
       for (int i = cArray.length - 1; i >= 0; i--) {
           sb.append(cArray[i]);
       }
       return sb.toString();
    }
  //O(N)
    static String recursiveString(String str) {

        if(str.length() == 1) {
            return str;
        }

        return  recursiveString(str.substring(1)) + str.charAt(0);
    }

    //  The Ultimate Java ApproachIf you are writing production-grade Java,
    //  you should ideally avoid writing manual loops altogether.
    //  The framework provides a highly optimized, native solution inside the standard library
    //Why it's superior: The StringBuilder.reverse() method is implemented natively using low-level bitwise
    // operations and direct array modifications, making it significantly faster than manual
    // character-by-character loops.
    static String ultimateReverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    /**
     *
     The iterative approach (reverseString) is the best choice for production code due to its optimal memory
     efficiency and safety against application crashes.While both methods run in \(O(N)\) time complexity,
     they differ significantly in space complexity and execution safety.
     *
     *
     */
}
