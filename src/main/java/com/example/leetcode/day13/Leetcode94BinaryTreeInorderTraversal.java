package com.example.leetcode.day13;

public class Leetcode94BinaryTreeInorderTraversal {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList();
//        inorderTraversal(root, result);
//        return result;
//
//    }
//    private void inorderTraversal(TreeNode root, List<Integer> result) {
//        if(root == null){
//            return;
//        }
//        inorderTraversal(root.left, result);
//        result.add(root.val);
//        inorderTraversal(root.right, result);
//
//    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        while (cur != null || !stack.isEmpty()) {
//            if (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            } else {
//                cur = stack.pop();
//                result.add(cur.val);
//                cur = cur.right;
//            }
//        }
//        return result;
//    }
}
