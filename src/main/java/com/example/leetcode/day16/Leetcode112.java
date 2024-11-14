package com.example.leetcode.day16;

import com.example.leetcode.day13.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode112 {
    //initial thought
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        List<Integer> intArray = new ArrayList();
//        if(root == null){
//            return false;
//        }
//        return hasPathSum(root, intArray, targetSum);
//
//    }
//
//    public boolean hasPathSum(TreeNode root, List<Integer> intArray, int targetSum) {
//        intArray.add(root.val);
//        if(root.left == null && root.right == null){
//            int count = 0;
//            for(int i : intArray){
//                count += i;
//            }
//            if(count != targetSum){
//                return false;
//            }
//            return true;
//        }
//        boolean leftSum = false;
//        boolean rightSum = false;
//
//        if(root.left != null){
//            leftSum = hasPathSum(root.left,intArray, targetSum);
//            intArray.remove(intArray.size() -1);
//        }
//        if(leftSum){
//            return true;
//        }
//
//        if(root.right != null){
//            rightSum =hasPathSum(root.right,intArray, targetSum);
//            intArray.remove(intArray.size() -1);
//        }
//        return rightSum;
//    }

    // targetSum don't need to add because it is a primitive type

    //    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root == null){
//            return false;
//        }
//        targetSum = targetSum - root.val;
//
//        if(root.left == null && root.right == null){
//            return targetSum == 0;
//        }
//        if(root.left != null){
//            boolean hasLeftPathSum = hasPathSum(root.left, targetSum);
//            if(hasLeftPathSum){
//                return true;
//            }
//        }
//
//        if(root.right != null){
//            boolean hasRightPathSum = hasPathSum(root.right, targetSum);
//            if(hasRightPathSum){
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum = targetSum - root.val;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
