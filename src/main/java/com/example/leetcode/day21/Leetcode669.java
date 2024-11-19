package com.example.leetcode.day21;

import com.example.leetcode.day13.TreeNode;

public class Leetcode669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return null;
        }
        root.left = trimBST(root.left, low,high);
        root. right = trimBST(root.right, low,high);
        if(root.val > high){
            return root.left;
        }else if(root.val < low){
            return root.right;
        }
        return root;
    }
}
