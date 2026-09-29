package test.Arrays.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaximumSubarraySumLengthK {
    public static void main(String[] args) {
        int[] nums = {1,5,4,4,4,2,9,9,9};
        int k = 3;
        System.out.println("MaximumSubarraySumLengthK : " + maximumSubarraySum(nums, k));

        System.out.println("MaximumSubarraySumLengthK maximumSubarraySumOptimized : " + maximumSubarraySumOptimized(nums, k));
    }

    public static long maximumSubarraySumOptimized(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0, maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Add incoming element
            sum += nums[i];
            freq.merge(nums[i], 1, Integer::sum);

            // Remove outgoing element once window exceeds size k
            if (i >= k) {
                int out = nums[i - k];
                sum -= out;
                if (freq.merge(out, -1, Integer::sum) == 0) {
                    freq.remove(out);
                }
            }

            // Window is full and all elements are distinct
            if (i >= k - 1 && freq.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        long maxSum=0;
        for (int i=0;i<=nums.length-k;i++) {
            long sum=0;
            for(int j=i;j<i+k;j++) {
                set.add(nums[j]);
                sum +=nums[j];
            }

            if(set.size() != k) {
                set.clear();
                continue;
            }

            if(sum > maxSum) {
                maxSum = sum;
            }
            set.clear();

        }

        return maxSum;
    }
}
