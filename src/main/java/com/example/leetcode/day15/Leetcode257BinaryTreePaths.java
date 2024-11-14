package com.example.leetcode.day15;

import com.example.leetcode.day13.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257BinaryTreePaths {
    //No Backtracking Needed
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> routes = new ArrayList();
//        if(root == null){
//            return routes;
//        }
//        traceNode(root,routes, "");
//        return routes;
//
//    }
//
//    private void traceNode(TreeNode node, List<String> routes, String s){
//        if(node == null){
//            return;
//        }
//        if(node.left == null && node.right == null){
//            routes.add(s + node.val);
//            return;
//        }
//        String temp = s + node.val + "->";
//        traceNode(node.left, routes,temp);
//        traceNode(node.right, routes,temp);
//    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> intArray = new ArrayList();
        List<String> result = new ArrayList();
        binaryTreePaths(root,intArray, result);
        return result;
    }

    public void binaryTreePaths(TreeNode root, List<Integer> intArray, List<String> result) {
//        if(root == null){
//            return;
//        }
        intArray.add(root.val);
        if(root.left == null && root.right == null){
            StringBuilder builder = new StringBuilder();
            for(int i = 0 ; i < intArray.size() ; i ++){
                builder.append(intArray.get(i));
                if(i != intArray.size() - 1){
                    builder.append("->");
                }
            }
            result.add(builder.toString());
        }

        if(root.left != null){
            binaryTreePaths(root.left,intArray, result);
            intArray.remove(intArray.size() -1);
        }

        if(root.right != null){
            binaryTreePaths(root.right,intArray, result);
            intArray.remove(intArray.size() -1);
        }
    }
}
