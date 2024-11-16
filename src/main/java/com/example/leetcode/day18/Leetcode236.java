package com.example.leetcode.day18;

import com.example.leetcode.day13.TreeNode;

public class Leetcode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q || root == null){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);

        if(left == null && right == null){
            return null;
        }else if(left == null && right != null){
            return right;
        }else if(right == null && left != null){
            return left;
        }else{
            return root;
        }
    }
}
