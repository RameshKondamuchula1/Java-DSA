package example;


public class FibonacciSeries {
    public static void main(String[] args) {

        int input = 2;
        fibSeries(input);
        System.out.println("  ");
        for (int i=0;i<input;i++) {
            System.out.print(" " + fibRecursive(i));
        }
    }

    private static int fibRecursive(int input) {
        if(input <= 1) {
            return input;
        }

        return fibRecursive(input - 1) + fibRecursive(input - 2);
    }

    static void fibSeries(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        if(num == 1) {
            System.out.print(0 + " " + 1);
            return;
        }
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2);
        for(int i = 2; i < num;i++) {
            int temp = num1 + num2;
            System.out.print(" " + temp);
            num1 = num2;
            num2 = temp;
        }
    }
}
