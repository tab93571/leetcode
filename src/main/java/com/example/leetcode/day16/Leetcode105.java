package com.example.leetcode.day16;

import com.example.leetcode.day13.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode105 {
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length - 1, 0, inorder.length - 1);

    }

    private TreeNode buildTreeHelper(int[] preorder, int preorderStart, int preorderEnd, int inorderStart, int inorderEnd) {
        if (preorderStart > preorderEnd) {
            return null;
        }
        int val = preorder[preorderStart];
        int inorderMidIndex = map.get(val);
        TreeNode root = new TreeNode(val);
        int leftLength = inorderMidIndex - inorderStart;

        root.left = buildTreeHelper(preorder, preorderStart + 1, preorderStart + 1 + leftLength - 1, inorderStart, inorderMidIndex - 1);
        root.right = buildTreeHelper(preorder, preorderStart + 1 + leftLength, preorderEnd, inorderMidIndex + 1, inorderEnd);

        return root;

    }
}
