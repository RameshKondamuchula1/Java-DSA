package example;

public class BuyMinSellMaxProfit {
    public static void main(String[] args) {
        int[] input = {2, 6, 8, 1, 5, 7, 9, 3};
        System.out.println("Max Profit: " + maxProfit(input));
    }

    static int maxProfit(int[] arr) {
        int profit = 0;
        int minimum = arr[0];
        for(int i = 1;i< arr.length;i++) {
            minimum =Math.min(arr[i], minimum);
            if(arr[i] > minimum) {
                profit = Math.max(profit, arr[i] - minimum);
            }
        }
        return profit;
    }
}
