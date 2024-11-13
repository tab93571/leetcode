package com.example.leetcode.day15;

import com.example.leetcode.day13.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257BinaryTreePaths {
    //No Backtracking Needed
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> routes = new ArrayList();
        if(root == null){
            return routes;
        }
        traceNode(root,routes, "");
        return routes;

    }

    private void traceNode(TreeNode node, List<String> routes, String s){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            routes.add(s + node.val);
            return;
        }
        String temp = s + node.val + "->";
        traceNode(node.left, routes,temp);
        traceNode(node.right, routes,temp);
    }

    //todo use use arrayList<Integer>
}
