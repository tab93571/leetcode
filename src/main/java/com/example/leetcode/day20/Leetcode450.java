package com.example.leetcode.day20;

import com.example.leetcode.day13.TreeNode;

public class Leetcode450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        } else {
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                TreeNode rightSmallest = root.right;
                while (rightSmallest.left != null) {
                    rightSmallest = rightSmallest.left;
                }
                rightSmallest.right = deleteNode(root.right, rightSmallest.val);
                rightSmallest.left = root.left;

                return rightSmallest;
            }
        }
    }
}
