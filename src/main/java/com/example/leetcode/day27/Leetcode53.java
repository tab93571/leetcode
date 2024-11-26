package com.example.leetcode.day27;

public class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        new Leetcode53().maxSubArray(new int[]{-2,-100});
    }
}
