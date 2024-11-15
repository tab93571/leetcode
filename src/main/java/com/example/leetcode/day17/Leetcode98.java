package com.example.leetcode.day17;

import com.example.leetcode.day13.TreeNode;

import java.util.Stack;

public class Leetcode98 {
    //把中序遍歷的數季起來，下次再去比對
    long prev = Long.MIN_VALUE;

    // use long since there's a test case with Integer.MIN_VALUE
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        if (root.val <= prev) {
            return false;
        }
        prev = root.val;
        boolean right = isValidBST(root.right);
        return right;
    }


//    public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    public boolean isValidBST(TreeNode root, long lower, long upper) {
//        if (root == null) {
//            return true;
//        }
//        if (root.val <= lower || root.val >= upper) {
//            return false;
//        }
//        return isValidBST(root.left, lower, root.val) && isValidBST(root.right, root.val, upper);
//    }

    //    TreeNode pre;
//
//    public boolean isValidBST(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        // 左
//        boolean left = isValidBST(root.left);
//        if (!left) {
//            return false;
//        }
//        // 中
//        if (pre != null && root.val <= pre.val) {
//            return false;
//        }
//        pre = root;
//        // 右
//        boolean right = isValidBST(root.right);
//        return right;
//    }
    //iteration
//    public boolean isValidBST(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode pre = null;
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;// 左
//            }
//            // 中，处理
//            TreeNode pop = stack.pop();
//            if (pre != null && pop.val <= pre.val) {
//                return false;
//            }
//            pre = pop;
//
//            root = pop.right;// 右
//        }
//        return true;
//    }


}
