package com.example.leetcode.day22;

import java.util.ArrayList;
import java.util.List;

public class Leetcode216 {
    List<List<Integer>> results;

    public List<List<Integer>> combinationSum3(int k, int n) {
        results = new ArrayList();
        combinationSum3(1, k, n, new ArrayList(), 0);
        return results;
    }

    private void combinationSum3(int start, int k, int n, List list, int sum) {
        if (sum > n) {
            return;
        }
        if (list.size() == k) {
            if (sum == n) {
                results.add(new ArrayList(list));
            }
            return;
        }
        for (int i = start; i <= 9 - (k - list.size()) + 1; i++) {
            list.add(i);
            combinationSum3(i + 1, k, n, list, sum + i);
            list.remove(list.size() - 1);
        }
    }
}
