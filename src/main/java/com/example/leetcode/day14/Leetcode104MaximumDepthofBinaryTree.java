package com.example.leetcode.day14;

import com.example.leetcode.day13.TreeNode;

public class Leetcode104MaximumDepthofBinaryTree {

//    Bottom-Up Approach:
//    Calculates the maximum depth by propagating depth values from the leaves up to the root.
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

//    int max = 0;
//    int tempDepth = 0;
//    public int maxDepth(TreeNode root) {
//        ans(root);
//        return max;
//
//    }
//    private void ans(TreeNode node){
//        if(node == null){
//            return;
//        }
//        tempDepth ++;
//        max = tempDepth > max? tempDepth : max;
//        ans(node.left);
//        ans(node.right);
//        tempDepth --; // this is necessary
//    }

//    Top-Down Approach:
//    Starts from the root, tracking the current depth as it moves downward to the leaves, and updates the maximum depth encountered along the way.
//    int max = 0;
//    public int maxDepth(TreeNode root) {
//        ans(root, 0);
//        return max;
//
//    }
//    private void ans(TreeNode node, int tempDepth){
//        if(node == null){
//            return;
//        }
//        tempDepth ++;
//        max = tempDepth > max? tempDepth : max;
//        ans(node.left, tempDepth);
//        ans(node.right, tempDepth);
//
//    }
    //iteration
    // level order
}
