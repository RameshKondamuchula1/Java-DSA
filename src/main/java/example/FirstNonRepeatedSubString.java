package example;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedSubString {
    public static void main(String[] args) {

        String str = "1R1T7";
        System.out.println("Non Rep Substring length : " + getSubstring(str));
    }

    static int getSubstring(String str) {

        char[] charArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        String answer = "";
        int index = 0, maxLength = 0;
        for(int i = 0; i<charArr.length;i++) {
            if(map.containsKey(charArr[i])) {
                index = Math.max(index, map.get(charArr[i]) + 1);
            }
            map.put(charArr[i], i);
            int currentLength = i - index + 1;
            if(currentLength > maxLength) {
                answer = str.substring(index, i+1);
                maxLength = currentLength;
            }

        }
        System.out.println("Non repeated string is : " + answer);

        return answer.length();
    }
}
