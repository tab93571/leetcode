package com.example.leetcode.day14;

import com.example.leetcode.day13.TreeNode;

public class Leetcode111MinimumDepthofBinaryTree {
    //    最小深度是从根节点到最近叶子节点的最短路径上的节点数量
//    public int minDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftDepth = minDepth(root.left);
//        int rightDepth = minDepth(root.right);
//        if (rightDepth == 0) {
//            return leftDepth + 1;
//        }
//        if (leftDepth == 0) {
//            return rightDepth + 1;
//        }
//        return Math.min(leftDepth, rightDepth) + 1;
//    }
    int depth = 0;
    // 定义最小深度，初始化最大值
    int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        dep(root);
        return minDepth == Integer.MAX_VALUE ? 0 : minDepth;
    }

    void dep(TreeNode root) {
        if (root == null) return;
        depth++;
        dep(root.left);
        dep(root.right);
        //leaf
        if (root.left == null && root.right == null)
            minDepth = Math.min(minDepth, depth);
        // 递归结束，深度减小
        depth--; // this line is not necessary
    }
}
