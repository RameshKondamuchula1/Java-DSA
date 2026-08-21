package example;

import java.util.Arrays;

public class MaintainsOrderWhileRemovingDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3,3,4,5,1,1,1,7,7};
        System.out.println("result: " + Arrays.toString(maintainsOrder(arr)));
    }

    private static int[] maintainsOrder(int[] arr) {

        return Arrays.stream(arr).distinct().toArray();
    }
}
