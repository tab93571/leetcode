package com.example.leetcode.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode47 {
    List<List<Integer>> results;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        results = new ArrayList();
        permuteHelper(nums, new boolean[nums.length], new LinkedList());
        return results;
    }

    private void permuteHelper(int[] nums, boolean[] used, LinkedList<Integer> temp) {

        if (temp.size() == nums.length) {
            results.add(new ArrayList(temp));
            return;
        }
        Integer pre = null;
        for (int i = 0; i < nums.length; i++) {
            if (!used[i] && (pre == null || nums[i] != pre)) {
                temp.add(nums[i]);
                pre = nums[i];
                used[i] = true;
                permuteHelper(nums, used, temp);
                temp.removeLast();
                used[i] = false;
            }
        }
    }
}
