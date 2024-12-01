package com.example.leetcode.day28;

public class Leetcode122 {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result += Math.max(prices[i] - prices[i - 1], 0);
        }
        return result;
    }

    public static void main(String[] args) {
        new Leetcode122().maxProfit(new int[]{1,90,10,1000});
    }
}
