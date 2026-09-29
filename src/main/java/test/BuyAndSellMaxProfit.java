package test;

import java.sql.SQLOutput;

public class BuyAndSellMaxProfit {

    public static void main(String[] args) {
        int[] stocks = {2, 4, 7, 1, 6, 5, 9, 3, 8};

        System.out.println("Max Profit: " + maxProfit(stocks));
        System.out.println("Max Profit Approach2: " + maxProfit2(stocks));
    }

    private static int maxProfit2(int[] stocks) {
        int profit = 0;
        int minimum = stocks[0];
        for(int i = 1; i<stocks.length;i++) {

            minimum = Math.min(minimum, stocks[i]);
            profit = Math.max(profit, stocks[i] - minimum);
        }
        return profit;
    }

    private static int maxProfit(int[] stocks) {
        int profit = 0;
        int minimum = stocks[0];
        for(int i = 1; i<stocks.length;i++) {
            int currentStock = stocks[i];

            if(currentStock > minimum) {
                profit = Math.max(profit, currentStock - minimum);
            } else {
                minimum = currentStock;
            }
        }
        return profit;
    }


}
