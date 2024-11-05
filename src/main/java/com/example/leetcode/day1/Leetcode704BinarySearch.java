package com.example.leetcode.day1;

public class Leetcode704BinarySearch {
    //    [i,j]
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //    [i,j)
//    public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] > target) {
//                right = mid;
//
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }

    //recursion
//    public int search(int[] nums, int target) {
//        return search(0, nums.length - 1, nums, target);
//    }
//
//    private int search(int left, int right, int[] nums, int target) {
//        if (left > right) {
//            return -1;
//        }
//        int mid = (left + right) / 2;
//        if (nums[mid] == target) {
//            return mid;
//        } else if (nums[mid] > target) {
//            return search(left, mid - 1, nums, target);
//        } else {
//            return search(mid + 1, right, nums, target);
//        }
//    }
}
