package com.example.leetcode.day25;

import java.util.*;

public class Leetcode491 {
    List<List<Integer>> results;

    public List<List<Integer>> findSubsequences(int[] nums) {
        results = new ArrayList();
        findSubsequences(nums, 0, new LinkedList());
        return results;
    }

    private void findSubsequences(int[] nums, int start, LinkedList<Integer> temp) {
        if (temp.size() >= 2) {
            results.add(new ArrayList(temp));
        }

        if (start == nums.length) {

            return;
        }
        Set<Integer> set = new HashSet();

        for (int i = start; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            if (temp.isEmpty() || nums[i] >= temp.getLast()) {
                temp.add(nums[i]);
                findSubsequences(nums, i + 1, temp);
                temp.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        new Leetcode491().findSubsequences(new int[]{4, 6, 7, 7});
    }
}
