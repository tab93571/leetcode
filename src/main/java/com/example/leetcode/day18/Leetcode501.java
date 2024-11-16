package com.example.leetcode.day18;

import com.example.leetcode.day13.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode501 {
    TreeNode pre;
    int maxFrequency = 0;
    int frequency = 0;
    List<Integer> arrayList = new ArrayList();

    public int[] findMode(TreeNode root) {
        find(root);
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    private void find(TreeNode root) {
        if (root == null) {
            return;
        }
        find(root.left);

        if (pre != null && root.val == pre.val) {
            frequency++;
        } else {
            frequency = 1;
        }
        if (frequency > maxFrequency) {
            arrayList.clear();
            arrayList.add(root.val);
            maxFrequency = frequency;
        } else if (frequency == maxFrequency) {
            arrayList.add(root.val);
        }
        pre = root;
        find(root.right);
    }

    //iteration
}
