package com.example.leetcode.day18;

import com.example.leetcode.day13.TreeNode;

public class Leetcode530 {
    TreeNode pre;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        getMinimumDifferenceHelper(root);
        return minDiff;
    }
    private void getMinimumDifferenceHelper(TreeNode root) {
        if(root == null){
            return;
        }
        getMinimumDifferenceHelper(root.left);

        if(pre != null){
            minDiff = Math.min(root.val - pre.val, minDiff);
        }
        pre = root;

        getMinimumDifferenceHelper(root.right);
    }
}
