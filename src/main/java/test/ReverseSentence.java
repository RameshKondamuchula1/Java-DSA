package test;

public class ReverseSentence {
    public static void main(String[] args) {

        String input = "Reverse this Sentence";
        System.out.printf("Reverse Sentence : %s%n", reverseWords(input));

        System.out.printf("Reverse Sentence Words and Alphabets : %s%n", reverseAlphabetsWords(input));
    }

    private static String reverseWords(String input) {

       String[] str = input.split(" ");
       int l = str.length;
       StringBuilder sb = new StringBuilder();
       while(l > 0) {
           sb.append(str[l-1]).append(" ");
           l--;
       }
        return sb.toString().trim();
    }

    private static String reverseAlphabetsWords(String input) {

        char[] charArray = input.toCharArray();
        int m = charArray.length;
        StringBuilder sb = new StringBuilder();
        while(m > 0) {
            sb.append(charArray[m-1]);
            m--;
        }
        return sb.toString().trim();
    }

    // TC O(M) -===> M is length of the array
}
