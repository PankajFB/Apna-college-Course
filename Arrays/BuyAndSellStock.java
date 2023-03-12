package com.company.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {5,8,6,2,1,2,5,9,6,7};
        int result  = maxProfit(prices);
        System.out.println(result);
    }

    private static int maxProfit(int[] prices) {
//        we will declare two variables the buyPrice and maxProfit
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

//        now we will iterate through each day price of the stock and update the two variables to maximise the profits
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // this is out todays profit
                maxProfit = Math.max(profit,maxProfit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
