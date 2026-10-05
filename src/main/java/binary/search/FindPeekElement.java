package binary.search;

public class FindPeekElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4}; // 1,2,3,1  --> output = 2
        System.out.println("Peek is: " + findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if(nums ==  null) {
            return -1;
        }

        if(nums.length == 1) {
            return 0;
        }
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
