package com.example.leetcode.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode90 {
    List<List<Integer>> results;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        results = new ArrayList();
        LinkedList<Integer> temp = new LinkedList();
        subsetsWithDup(nums, 0, temp);
        return results;
    }

    private void subsetsWithDup(int[] nums, int start, LinkedList<Integer> temp) {
        results.add(new ArrayList(temp));

        if (start == nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            subsetsWithDup(nums, i + 1, temp);
            temp.removeLast();
        }

    }
}
