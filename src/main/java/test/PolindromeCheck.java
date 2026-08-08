package test;

public class PolindromeCheck {
    public static void main(String[] args) {
        String input = "Ram";
        System.out.println("Is " + input + " polindrome: " + polyCheck(input));
    }

    private static boolean polyCheck(String input) {

        char[] array = input.toCharArray();

        int i = 0;
        int j = array.length - 1;

        while(i < j) {// TC is 0(N/2) = 0(N)
            if(array[i] != array[j]) {return false;}
            i++;
            j--;
        }
       return true;
    }
}
/*
racecar
rotator
MOM
DAD
 **/