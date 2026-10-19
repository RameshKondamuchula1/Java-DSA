package binary.search;

public class MinimumShipDays {

    public static void main(String[] args) {
        int[] weights = {12, 34, 4, 23, 5, 78};
        System.out.println("Minimum ship days: " + shipWithinDays(weights, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int end = 0;
        int start = 0;
        for (int w: weights) {
            end +=w;
            if(start < w) {
                start = w;
            }
        }
        while(start < end) {
            int mid = (start+end)/2;
            if(isShippingPossible(weights,days,mid)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    public static boolean isShippingPossible(int[] weights, int days, int minWeigt) {
        int sum = 0;
        int countDays=1;
        for (int w: weights) {
            if(sum + w > minWeigt) {
                countDays++;
                sum = w;
            } else {
                sum+=w;
            }
        }
        return countDays <= days;
    }
}
