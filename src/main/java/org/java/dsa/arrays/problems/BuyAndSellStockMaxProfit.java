package org.java.dsa.arrays.problems;

public class BuyAndSellStockMaxProfit {

    public static void main(String[] args) {
        int[] prices = {7,1,5,4,6,3,2};

        int profit = 0;

        int minSoFar = prices[0];

        for(int i = 1; i < prices.length;i++) {
            int currentProfit = prices[i] - minSoFar;
            if (profit < currentProfit) {
                profit = currentProfit;
            }
            minSoFar = Math.min(prices[i], minSoFar);
        }

        System.out.println("Profit: " + profit);
    }
}
