package com.example.leetcode.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode145BinaryTreePostorderTraversal {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList();
//        postorderTraversal(root, result);
//        return result;
//
//    }
//
//    private void postorderTraversal(TreeNode root, List<Integer> result) {
//        if (root == null) {
//            return;
//        }
//        postorderTraversal(root.left, result);
//        postorderTraversal(root.right, result);
//        result.add(root.val);
//    }


    //中左右 => 中右左 => 左右中

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            result.add(node.val);
        }
        Collections.reverse(result);
        return result;
    }
}
