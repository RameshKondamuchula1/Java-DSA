package org.java.dsa.arrays.two_pointer;

import java.util.Arrays;

public class RemoveDuplicatesTwoPointer {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Final Length: " + removeDuplicates(nums));
        System.out.println("Final Length: " + removeDuplicatesOptimized(nums1));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        int prev = nums[0];
        for(int i =1; i<nums.length;i++) {
            if(nums[i] != prev) {
                index +=1;
                prev=nums[i];
                nums[index]=prev;
            }
        }
        System.out.println("Final Length: " + Arrays.toString(nums));
        return index+1;
    }

    public static int removeDuplicatesOptimized(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println("Final Length: " + Arrays.toString(nums));
        return i+1;
    }
}
