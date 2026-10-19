package binary.search;

public class SearchTargetInKTimesRotatedSortedArray {
    public static void main(String[] args) {
        int[] piles = {6,7,8,0,1,2,3,4,5};
        System.out.println("Target is at Index: " + search(piles, 8));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        // [4,5,6,7,0,1,2]
        while (start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if(nums[start] <= target && target < nums[mid]) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target <= nums[end] && target > nums[mid]) {
                    start = mid+1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
