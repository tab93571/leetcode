package com.example.leetcode.day18;

public class Leetcode80 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 1; //在這之前有幾個了

        while (fast != nums.length) {
            nums[slow] = nums[fast];
            if (slow == 0 || nums[slow] != nums[slow - 1]) {
                slow++;
                count = 1;
            } else if (count == 1) {
                slow++;
                count++;
            } else {
                count++;
            }
            fast++;
        }
        return slow;
    }
}
