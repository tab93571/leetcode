package com.example.leetcode.day20;

import com.example.leetcode.day13.TreeNode;

public class Leetcode235 {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(p.val > root.val && q.val > root.val){
//            return lowestCommonAncestor(root.right,p,q);
//        }else if(p.val < root.val && q.val < root.val){
//            return lowestCommonAncestor(root.left,p,q);
//        }
//        //一個等於一個大於 || 一個等於一個小於 || 一個大於一個小於
//        return root;
//    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(p.val > root.val && q.val > root.val){
                root = root.right;
            }else if(p.val < root.val && q.val < root.val){
                root = root.left;
            }else{
                break;
            }
        }
        return root;
    }

}
