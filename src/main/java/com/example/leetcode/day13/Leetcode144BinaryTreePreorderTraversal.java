package com.example.leetcode.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode144BinaryTreePreorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList();
//        preorderTraversal(root, result);
//        return result;
//
//    }
//
//    private void preorderTraversal(TreeNode node, List<Integer> result) {
//        if (node == null) {
//            return;
//        }
//        result.add(node.val);
//        preorderTraversal(node.left, result);
//        preorderTraversal(node.right, result);
//
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node =  stack.pop();
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
            result.add(node.val);
        }
        return result;
    }
}
