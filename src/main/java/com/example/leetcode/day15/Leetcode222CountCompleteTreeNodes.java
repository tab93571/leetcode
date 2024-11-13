package com.example.leetcode.day15;

import com.example.leetcode.day13.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode222CountCompleteTreeNodes {

//    时间复杂度：O(n)
//    空间复杂度：O(log n)，算上了递归系统栈占用的空间

    //recursive
//    public int countNodes(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        return countNodes(root.left) + countNodes(root.right) + 1;
//    }

    //iteration
    //时间复杂度：O(n)
    //空间复杂度：O(n)
//    public int countNodes(TreeNode root) {
//        int count = 0;
//        if (root == null) {
//            return count;
//        }
//        Queue<TreeNode> queue = new LinkedList();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            TreeNode remove = queue.poll();
//            count++;
//            if (remove.left != null) {
//                queue.add(remove.left);
//            }
//            if (remove.right != null) {
//                queue.add(remove.right);
//            }
//        }
//        return count;
//    }

    // use complete binary tree feature
//    时间复杂度：O(log n × log n)
//    空间复杂度：O(log n)
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = 0;
        int rightDepth = 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        while (left != null) {
            leftDepth++;
            left = left.left;
        }
        while (right != null) {
            rightDepth++;
            right = right.right;
        }
        if (leftDepth == rightDepth) {
            return (int) Math.pow(2, leftDepth + 1) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
