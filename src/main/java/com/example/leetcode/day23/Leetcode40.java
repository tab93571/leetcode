//package com.example.leetcode.day23;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Leetcode40 {
//    List<List<Integer>> results;
//
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        results = new ArrayList();
//        Arrays.sort(candidates);
//        combinationSum(candidates, target, 0, new LinkedList(), 0);
//        return results;
//    }
//    public void combinationSum(int[] candidates, int target, int start, List temp, int sum) {
//
//        if (sum > target) {
//            return;
//        }
//        if (sum == target) {
//            results.add(new ArrayList(temp));
//            return;
//        }
//
//        for (int i = start; i < candidates.length; i++) {
//            if (i > start && candidates[i] == candidates[i - 1]) {
//                continue;
//            }
//            temp.add(candidates[i]);
//            combinationSum(candidates, target, i + 1, temp, sum + candidates[i]);
//            temp.removeLast();
//        }
//    }
//}
