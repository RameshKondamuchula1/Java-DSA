package example;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        String s = "(()[]{})";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        if(s == null || s.length() < 2 || s.length()%2 !=0) {
            System.out.println("Invalid Input");
            return false;
        }
        char[] strArray = s.toCharArray();

        Stack<Character> chr = new Stack<>();
        for(char c: strArray) {// TC O(1)
            if (c == '(' || c == '{' || c == '[') {
                chr.push(c);
            } else if ((!chr.isEmpty()) && (c == ')' || c == '}' || c == ']')) {
                char ch = chr.pop();
                if(c == ')' && ch != '(') return false;
                if(c == '}' && ch == '{') return false;
                if(c == ']' && ch == '[') return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
