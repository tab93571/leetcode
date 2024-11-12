package com.example.leetcode.day14;

import com.example.leetcode.day13.TreeNode;

public class Leetcode226InvertBinaryTree {
    //both preorder and postorder are appropriate
    //inorder can not work
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
        return root;
    }

    //if we need to make it inorder, it is something like this, but it is not inorder
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        invertTree(root.left);
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        invertTree(root.left);
//
//        return root;
//    }
}
