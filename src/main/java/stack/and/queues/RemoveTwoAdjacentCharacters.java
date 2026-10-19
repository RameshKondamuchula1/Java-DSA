package stack.and.queues;

import java.util.Stack;

public class RemoveTwoAdjacentCharacters {
    public static void main(String[] args) {

        System.out.println("Non Two Adjacent: " + removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        stack.add(s.charAt(0));
        for (int i=1;i<s.length();i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && c==stack.peek()){
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        StringBuilder sb = new StringBuilder();
        for(char c: stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
/*
Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
*/
