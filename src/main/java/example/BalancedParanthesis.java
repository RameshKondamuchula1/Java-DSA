package example;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String input = "()))";
        System.out.print("Balanced Paranthesis for input: " + input);
        System.out.print(" is:  " + getString(input));
    }

    private static String getString(String input) {
        int balance = 0;
        for(char c: input.toCharArray()) {
            if(c == '(') {
                balance++;
            }else {
                balance--;
            }
        }
        if(balance < 0) {
            balance = -balance;
            input = "(".repeat(balance) + input;
        }else {
            input = input + ")";
        }

        return input;
    }
}
