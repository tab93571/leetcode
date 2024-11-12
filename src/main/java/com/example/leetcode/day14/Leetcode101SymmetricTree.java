package com.example.leetcode.day14;

import com.example.leetcode.day13.TreeNode;

public class Leetcode101SymmetricTree {
    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        boolean outsideSymmetric = compare(left.left, right.right);
        boolean insideSymmetric = compare(left.right, right.left);
        return outsideSymmetric && insideSymmetric;
    }
}
