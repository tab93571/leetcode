package com.example.leetcode.day16;

import com.example.leetcode.day13.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode513 {

//    int size = queue.size();
//    for (int i = 0; i < size; i++) {
//        TreeNode poll = queue.poll();
//        if (i == 0) {
//            result = poll.val;
//        }
//        if (poll.left != null) {
//            queue.offer(poll.left);
//        }
//        if (poll.right != null) {
//            queue.offer(poll.right);
//        }
//    }

    //iteration
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int result = 0;

        while (!queue.isEmpty()) {
            int originalSize = queue.size();
            int count = originalSize;
            while (count > 0) {
                TreeNode remove = queue.poll();
                if (count == originalSize) {
                    result = remove.val;
                }
                if (remove.left != null) {
                    queue.offer(remove.left);
                }
                if (remove.right != null) {
                    queue.offer(remove.right);
                }
                count--;
            }
        }
        return result;
    }

    //recursion

}
