package com.example.leetcode.day16;

import com.example.leetcode.day13.TreeNode;

public class Leetcode106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inorderStart, int inorderEnd, int postorderStart, int postorderEnd) {
        if (postorderStart > postorderEnd) {
            return null;
        }
        int val = postorder[postorderEnd];
        TreeNode root = new TreeNode(val);

        int midIndex;
        for (midIndex = inorderStart; midIndex <= inorderEnd; midIndex++) {
            if (inorder[midIndex] == val) {
                break;
            }
        }
        int leftInorderStart = inorderStart;
        int leftInorderEnd = midIndex - 1;
        ;
        int rightInorderStart = midIndex + 1;
        int rightInorderEnd = inorderEnd;

        int leftPostorderStart = postorderStart;
        int leftPostorderEnd = postorderStart + (midIndex - leftInorderStart) - 1;
        int rightPostorderStart = leftPostorderEnd + 1;
        int rightPostorderEnd = postorderEnd - 1;
        root.left = buildTreeHelper(inorder, postorder, leftInorderStart, leftInorderEnd, leftPostorderStart, leftPostorderEnd);
        root.right = buildTreeHelper(inorder, postorder, rightInorderStart, rightInorderEnd, rightPostorderStart, rightPostorderEnd);
        return root;
    }
}
