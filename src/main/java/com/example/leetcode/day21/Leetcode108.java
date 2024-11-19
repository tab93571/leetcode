package com.example.leetcode.day21;

import com.example.leetcode.day13.TreeNode;

public class Leetcode108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length -1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int lower, int upper) {
        if(lower > upper){
            return null;
        }
        int mid = (lower + upper)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, lower, mid -1);
        node.right = sortedArrayToBST(nums, mid + 1, upper);
        return node;
    }
}
