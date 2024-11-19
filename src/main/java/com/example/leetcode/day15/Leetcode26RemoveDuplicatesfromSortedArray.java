package com.example.leetcode.day15;

public class Leetcode26RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast != nums.length) {
            nums[slow] = nums[fast];
            if (slow == 0 || nums[slow] != nums[slow - 1]) {
                slow++;
            }
            fast++;
        }
        return slow;
    }

    //for loop

//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[j - 1]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//        return i + 1;
//    }
}
