package com.example.leetcode.day20;

import com.example.leetcode.day13.TreeNode;

public class Leetcode701 {
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if(root == null){
//            return new TreeNode(val);
//        }
//        if(val == root.val){
//            return root;
//        }else if(val > root.val){
//            root.right = insertIntoBST(root.right, val);
//        }else{
//            root.left = insertIntoBST(root.left, val);
//        }
//        return root;
//    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode node = root;
        while (node != null) {
            if (node.val == val) {
                break;
            } else if (val > node.val) {
                if (node.right == null) {
                    node.right = new TreeNode(val);
                    break;
                } else {
                    node = node.right;
                }
            } else {
                if (node.left == null) {
                    node.left = new TreeNode(val);
                    break;
                } else {
                    node = node.left;
                }
            }
        }
        return root;
    }
}
