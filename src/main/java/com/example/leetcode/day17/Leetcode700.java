package com.example.leetcode.day17;

import com.example.leetcode.day13.TreeNode;

public class Leetcode700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val > root.val) {
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }
    //iteration, since it's BST, we don't need backtrace
//    public TreeNode searchBST(TreeNode root, int val) {
//        if(root == null){
//            return null;
//        }
//        while(root != null){
//            if(root.val == val){
//                return root;
//            }else if(val > root.val){
//                root = root.right;
//            }else{
//                root = root.left;
//            }
//        }
//        return null;
//    }
}
