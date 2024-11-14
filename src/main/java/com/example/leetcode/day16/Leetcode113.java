package com.example.leetcode.day16;

import com.example.leetcode.day13.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode113 {
    //initial thought
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> results = new ArrayList();
        if (root == null) {
            return results;
        }
        List<Integer> numbers = new ArrayList();
        pathSum(root, targetSum, results, numbers);
        return results;
    }

    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> results, List<Integer> numbers) {
        numbers.add(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                List<Integer> intList = new ArrayList(numbers);
                results.add(intList);
            }
            return;
        }
        if (root.left != null) {
            pathSum(root.left, targetSum, results, numbers);
            numbers.remove(numbers.size() - 1);
        }
        if (root.right != null) {
            pathSum(root.right, targetSum, results, numbers);
            numbers.remove(numbers.size() - 1);
        }
    }

//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        List<List<Integer>> results = new ArrayList();
//        List<Integer> numbers = new ArrayList();
//        pathSum(root, targetSum, results, numbers);
//        return results;
//    }
//
//    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> results, List<Integer> numbers) {
//        if(root == null){
//            return;
//        }
//        numbers.add(root.val);
//        targetSum -= root.val;
//        if(root.left == null && root.right == null && targetSum == 0){
//            List<Integer> intList = new ArrayList(numbers);
//            results.add(intList);
//        }
//        pathSum(root.left, targetSum, results, numbers);
//        pathSum(root.right, targetSum, results, numbers);
//        numbers.remove(numbers.size() -1);
//
//    }
}
