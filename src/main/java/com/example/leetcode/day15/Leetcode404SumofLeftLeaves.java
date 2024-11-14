package com.example.leetcode.day15;

import com.example.leetcode.day13.TreeNode;

public class Leetcode404SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftNodeLeftLeaves;
        if(root.left != null && root.left.right == null && root.left.left == null){
            leftNodeLeftLeaves = root.left.val;
        }else{
            leftNodeLeftLeaves = sumOfLeftLeaves(root.left);
        }
        int rightNodeLeftLeaves = sumOfLeftLeaves(root.right);

        return leftNodeLeftLeaves + rightNodeLeftLeaves;
    }

//    public int sumOfLeftLeaves(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        int leftValue = sumOfLeftLeaves(root.left);    // 左
//        int rightValue = sumOfLeftLeaves(root.right);  // 右
//
//        int midValue = 0;
//        if (root.left != null && root.left.left == null && root.left.right == null) {
//            midValue = root.left.val;
//        }
//        int sum = midValue + leftValue + rightValue;
//        return sum;
//    }

    //iteration
}
