package com.example.leetcode.day21;

import com.example.leetcode.day13.TreeNode;

public class Leetcode538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        root.right = convertBST(root.right);

        root.val += sum;
        sum = root.val;

        root.left = convertBST(root.left);
        return root;
    }
}
