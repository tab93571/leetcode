package com.example.leetcode.day28;

import java.util.Arrays;

public class Leetcode1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (k == 0) {
                break;
            }
            if (nums[i] < 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        if (k > 0) {
            for (int i = 0; i < k % 2; i++) {
                nums[0] = -1 * nums[0];
            }
        }
        return Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        new Leetcode1005().largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3);

    }
}
