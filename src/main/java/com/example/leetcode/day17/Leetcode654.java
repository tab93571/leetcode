package com.example.leetcode.day17;

import com.example.leetcode.day13.TreeNode;

public class Leetcode654 {
    //initial thought
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);

    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int lower, int upper) {
        if (lower > upper) {
            return null;
        }
        int maxValueIndex = lower;

        for (int i = lower + 1; i <= upper; i++) {
            if (nums[i] > nums[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxValueIndex]);
        root.left = constructMaximumBinaryTree(nums, lower, maxValueIndex - 1);
        root.right = constructMaximumBinaryTree(nums, maxValueIndex + 1, upper);
        return root;
    }
}
