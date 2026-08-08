package org.java.dsa.arrays.compareClasses;

import java.util.Arrays;

public class ComparableComparator {
    public static void main(String[] args) {

        Tuple[] arr = new Tuple[4];

        arr[0] = new Tuple(100, 23);
        arr[1] = new Tuple(20, 3);
        arr[2] = new Tuple(20, 15);
        arr[3] = new Tuple(2, 230);

        // Technique1 : Passing Comparator
        Arrays.sort(arr, (t1,t2) -> {
            if(t1.b != t2.b) {
                return t1.b- t2.b;
            } else {
                return t1.a - t2.a;
            }
        });

        // Technique1 : Passing Comparator
        //Arrays.sort(arr); Implement Comparable interface and Implement the logic in compareTo method

        System.out.println(" Sort with Comparator Lamba: " + Arrays.toString(arr));
    }
}

class Tuple implements Comparable<Tuple>{
    int a;
    int b;

    public Tuple(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public int compareTo(Tuple other) {
        if(this.b != other.b){
            return this.b - other.b;
        } else{
            return this.a - other.a;
        }
    }

    @Override
    public String toString() {
        return "[" + a + " , " + b + "]";
    }
}
