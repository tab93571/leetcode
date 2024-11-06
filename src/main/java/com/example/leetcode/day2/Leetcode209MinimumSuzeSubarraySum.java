package com.example.leetcode.day2;

public class Leetcode209MinimumSuzeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                minLength = Math.min((end - start + 1), minLength);
                sum -= nums[start];
                start++;
            }
        }
        return ((minLength == Integer.MAX_VALUE) ? 0 : minLength);
    }
}
