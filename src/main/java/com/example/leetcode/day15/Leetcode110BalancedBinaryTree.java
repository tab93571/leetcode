package com.example.leetcode.day15;

import com.example.leetcode.day13.TreeNode;

public class Leetcode110BalancedBinaryTree {
//    not good, two recursive
//     we can get judege if it's balance by getHeight
//     since getHeight will get the height from bottom to top
//    public boolean isBalanced(TreeNode root) {
//
//        if(root == null){
//            return true;
//        }
//
//        if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1){
//            return false;
//        }
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//
//    public int getHeight(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//    }
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) == -1 ? false : true;
    }

    public int getHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = getHeight(root.right);
        if(rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
