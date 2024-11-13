package com.example.leetcode.day15;

import com.example.leetcode.day13.TreeNode;

public class Leetcode404SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftNodeLeftLeaves = 0;
        int rightNodeLeftLeaves = 0;
        if(root.left != null && root.left.right == null && root.left.left == null){
            leftNodeLeftLeaves = root.left.val;
        }else{
            leftNodeLeftLeaves = sumOfLeftLeaves(root.left);
        }
        rightNodeLeftLeaves = sumOfLeftLeaves(root.right);

        return leftNodeLeftLeaves + rightNodeLeftLeaves;
    }

    //iteration
}
