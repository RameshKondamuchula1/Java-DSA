package test.Arrays.slidingwindow.kadens;

public class MaxSumOfSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Approach1 :"  + maxSubArray(nums));

        System.out.println("Approach2 :"  + maxSubArray2(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int maxSubArray2(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        if(nums.length == 1) return nums[0];
        for(int num: nums) {
            sum = sum + num;
            maxSum = Math.max(maxSum,sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
