package example;

import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        String input = "(({}[()";
        System.out.println("Answer: " + validator(input));
    }

    static boolean validator(String input) {
        if(input == null || input.isEmpty() || input.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char c: input.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char endChar = stack.pop();
                if(c == ')' && endChar != '(') return false;
                if(c == '}' && endChar != '{') return false;
                if(c == ']' && endChar != '[') return false;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
