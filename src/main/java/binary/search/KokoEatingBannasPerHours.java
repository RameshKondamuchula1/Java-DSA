package binary.search;

public class KokoEatingBannasPerHours {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        System.out.println("Min Eating Speed: " + minEatingSpeed(piles, 6));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int p:piles) {
            end +=p;
        }

        while (start < end) {
            int mid = (start+end)/2;
            if(canEatMaximum(piles, h, mid)){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    public static boolean canEatMaximum(int[] piles, int h, int possible) {
        int hours = 0;
        for (int p: piles) {
          hours = hours + (p/possible) + (p%possible==0 ? 0 : 1);
        }
        return hours <= h;
    }
}
