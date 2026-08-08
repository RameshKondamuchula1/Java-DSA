package test;

import java.sql.SQLOutput;

public class BuyAndSellMaxProfit {

    public static void main(String[] args) {
        int[] stocks = {2, 4, 7, 1, 6, 5, 9, 3, 8};

        System.out.println("Max Profit: " + maxProfit(stocks));
    }

    private static int maxProfit(int[] stocks) {
        int profit = 0;
        int currentMinimum = stocks[0];
        for(int i = 1; i<stocks.length;i++) {
            int currentStock = stocks[i];

            if(currentStock > currentMinimum) {
                profit = Math.max(profit, currentStock - currentMinimum);
            } else {
                currentMinimum = currentStock;
            }
        }
        return profit;
    }
}
