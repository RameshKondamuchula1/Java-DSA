package example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PushGivenCharToEndOfTheArray {
    public static void main(String[] args) {
        int[] intArray = {1,9,2,0,4,3,0,8,0,7,0,6};
        pushToEndWithJava8(intArray);
    }

     static int[] pushToEndSlidingWindow(int[] arr) {
        int currentZeroIndex = 0;

        for(int i = 0; i<arr.length;i++) {
            if(arr[i] != 0) {
                int currentPosVal = arr[currentZeroIndex];
                arr[currentZeroIndex] = arr[i];
                arr[i] = currentPosVal;
                currentZeroIndex++;
            }
        }
      return arr;
     }

    static int[] pushToEndWithJava8(int[] arr) {
        //Approach 1: Time O(N)
        List<Integer> list = Arrays.stream(arr).boxed().filter(n -> n != 0).collect(Collectors.toCollection(LinkedList::new));
        //Approach 2: Time O(N)
        List<Integer> setList = new LinkedList<>();
        for (int i: arr) {
            if(i != 0) setList.add(i);
        }

        int diff = arr.length - setList.size();

        for (int i = 0; i < diff; i++) {
            setList.add(0);
            list.add(0);
        }

        System.out.println(list);
        System.out.println(" Post push " + list);

        return arr;
    }
}
