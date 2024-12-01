package com.example.leetcode.day28;

public class Leetcode162 {
    public int findPeakElement(int[] nums) {

        int lower = 0;
        int upper = nums.length -1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            long pre = mid -1 >= 0 ? nums[mid -1] : Long.MIN_VALUE;
            long next = mid + 1 <= nums.length -1 ? nums[mid + 1] : Long.MIN_VALUE;

            if (nums[mid] > pre && nums[mid] > next) {
                return mid;
            } else if (nums[mid] < pre) {
                upper = mid -1;
            } else {
                lower = mid + 1;
            }
        }
        return -1;
    }
}
