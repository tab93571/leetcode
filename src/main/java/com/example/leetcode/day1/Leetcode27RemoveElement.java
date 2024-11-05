package com.example.leetcode.day1;

public class Leetcode27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }

        }
        return insertIndex;
    }

    // [0, left -1]  != val
    //length - right - 1   == val
    //right + 1 != val

//    public int removeElement(int[] nums, int val) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            if (nums[left] == val) {
//                nums[left] = nums[right];
//                right--;
//            } else {
//                left++;
//            }
//        }
//        return left;
//    }

}
