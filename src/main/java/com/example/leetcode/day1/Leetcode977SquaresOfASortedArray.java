package com.example.leetcode.day1;

public class Leetcode977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] sortedSquared = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                sortedSquared[index] = nums[left] * nums[left];
                left++;
            } else {
                sortedSquared[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return sortedSquared;
    }
}
