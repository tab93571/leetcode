package com.example.leetcode.day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode46 {
    List<List<Integer>> results;

    public List<List<Integer>> permute(int[] nums) {
        results = new ArrayList();
        permute(nums, new boolean[nums.length], new LinkedList());
        return results;
    }

    private void permute(int[] nums, boolean[] used, LinkedList<Integer> temp) {

        if (temp.size() == nums.length) {
            results.add(new ArrayList(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                temp.add(nums[i]);
                used[i] = true;
                permute(nums, used, temp);
                temp.removeLast();
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new Leetcode46().permute(new int[]{1,2,3});
    }
}
