package com.example.leetcode.day32;

public class Leetcode746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        //dp 為從該位置跳

        for(int i = 2 ; i < cost.length ; i ++){
            dp[i] = cost[i] + Math.min(dp[i -1], dp[i - 2]);
        }
        return Math.min(dp[cost.length -1],dp[cost.length -2]);
    }
}
