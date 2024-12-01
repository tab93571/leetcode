package com.example.leetcode.day28;

public class Leetcode33 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;

        int result = binarySearch(nums, target, 0, pivot - 1);
        if (result != -1) {
            return result;
        }

        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        new Leetcode33().search(new int[]{4,5,6,7,0,1,2},4);
        new Leetcode33().search(new int[]{4,5,6,7},4);

    }
}
