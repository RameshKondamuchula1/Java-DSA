package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] intArray = {1,2,15,10,5};
        System.out.println("Missing Numbers: " + Arrays.toString(getMissingNumbers(intArray)));
        int[] intArray2 = {0,1,1};
        System.out.println("Missing Numbers 0 to N [0,2]: " + Arrays.toString(getMissingNumbersLengthZeroToN(intArray2)));
        int[] intArray3 = {0,1,1};
        System.out.println("Missing Numbers 1 to N [1,2]: " + Arrays.toString(getMissingNumbersLengthOneToN(intArray3)));
        int[] intArray4 = {0,1,2,3,5};
        System.out.println("Missing Numbers 0 to N [0,5]: " + Arrays.toString(getMissingNumbersLengthZeroToN(intArray4)));
        int[] intArray5 = {0,1,2,4,5};
        System.out.println("Missing Numbers 0 to N [0,5]: " + Arrays.toString(getMissingNumbersLengthZeroToN(intArray5)));
        int[] intArray6 = {1,2,0,4};
        System.out.println("Missing Numbers 1 to N [1,4]: " + Arrays.toString(getMissingNumbersLengthZeroToN(intArray6)));
    }

    static Object[] getMissingNumbers(int[] intArray) {
        Arrays.sort(intArray);

        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < intArray.length - 1; i++) {
            int current = intArray[i];
            int next = intArray[i + 1];

            // Fill all numbers between current and next
            for (int j = current + 1; j < next; j++) {
                missingNumbers.add(j);
            }
        }

        return missingNumbers.toArray();
    }

    static Object[] getMissingNumbersLengthZeroToN(int[] intArray) {
        Arrays.sort(intArray);

        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> set = Arrays.stream(intArray).boxed().collect(Collectors.toSet());
        for (int i= 0; i<intArray.length;i++) {
            if(set.add(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers.toArray();
    }

    static Object[] getMissingNumbersLengthOneToN(int[] intArray) {
        Arrays.sort(intArray);

        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> set = Arrays.stream(intArray).boxed().collect(Collectors.toSet());
        for (int i= 1; i<intArray.length;i++) {
            if(set.add(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers.toArray();
    }

    static int getOnlyMissingNumber(int[] intArray) {
        int sum = 0;
        int rangeSum = (intArray.length * (intArray.length + 1))/2;

        for (int num: intArray) {
            sum+=num;
        }
        return rangeSum - sum;

    }
}
