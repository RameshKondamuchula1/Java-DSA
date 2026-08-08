package test;

import java.util.function.IntFunction;

public class StringCaseConversion {

    public static void main(String[] args) {
        String input = "Meenu";
        System.out.println("LowerCase With StreamAPI: " + convertToLowerCaseStreamAPI(input));
        System.out.println("LowerCase  Without StreamAPI: " + convertToLowerCase(input));
        System.out.println("UpperCase With StreamAPI: " + convertToUpperCaseStreamAPI(input));
        System.out.println("UpperCase  Without StreamAPI: " + convertToUpperCase(input));
    }

    static String convertToLowerCaseStreamAPI(String input) {
        StringBuilder sb = new StringBuilder();

        input.chars().mapToObj(c -> {
                                    if(c <= 123 && c >= 97) {
                                        c = c -32;
                                    }
                                    return (char) c;
                              }).forEach(sb::append);

        return sb.toString();
    }

    static String convertToLowerCase(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chArray = input.toCharArray();
        for(char c: chArray) {
            int ch = (int) c;
            if(ch <= 123 && ch >= 97) {
                ch = ch - 32;
            }
            sb.append((char)ch);
        }

        return sb.toString();
    }

    static String convertToUpperCaseStreamAPI(String input) {
        StringBuilder sb = new StringBuilder();


        input.chars().mapToObj(c ->{
            if(c <= 90 && c >= 65) {
                c = c + 32;
            }
            return (char) c;
        }).forEach(sb::append);

        return sb.toString();
    }

    static String convertToUpperCase(String input) {
        StringBuilder sb = new StringBuilder();

        char[] chArray = input.toCharArray();
        for(char c : chArray) {
            int ch = (int) c;
            if(ch <= 90 && ch >=65) {
                ch = ch + 32;
            }
            sb.append((char)ch);
        }
        return sb.toString();
    }
}
