package com.example.leetcode.day28;

public class Leetcode45 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int nextCover = 0;
        int cover = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nextCover = Math.max(i + nums[i], nextCover);

            if (i == cover) {
                cover = nextCover;
                count++;
                if (cover >= nums.length - 1) {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Leetcode45().jump(new int[]{2, 1});

    }
}
