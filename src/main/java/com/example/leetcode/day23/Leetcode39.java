//package com.example.leetcode.day23;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Leetcode39 {
//    List<List<Integer>> results;
//
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        results = new ArrayList();
//        combinationSum(candidates, target, 0, new LinkedList(), 0);
//        return results;
//    }
//
//
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
//            temp.add(candidates[i]);
//            combinationSum(candidates, target, i, temp, sum + candidates[i]);
//            temp.removeLast();
//        }
//    }
//}
