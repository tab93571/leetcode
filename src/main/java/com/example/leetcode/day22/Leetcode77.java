package com.example.leetcode.day22;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {
    List<List<Integer>> results;

    public List<List<Integer>> combine(int n, int k) {
        results = new ArrayList();
        combine(1, n, new ArrayList<>(), k);
        return results;
    }

//    private void combine(int lower, int n, List<Integer> array, int k) {
//
//        if (k == array.size()) {
//            results.add(new ArrayList<>(array));
//            return;
//        }
//        for (int i = lower; i <= n; i++) {
//            array.add(i);
//            combine(i + 1, upper, array, k);
//            array.remove(array.size() - 1);
//        }
//    }

//  剪枝
    private void combine(int lower, int n, List<Integer> array, int k) {

        if (k == array.size()) {
            results.add(new ArrayList<>(array));
            return;
        }
        for (int i = lower; i <= n - (k - array.size()) + 1; i++) {
            array.add(i);
            combine(i + 1, n, array, k);
            array.remove(array.size() - 1);
        }
    }
}
