package com.example.leetcode.day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode78{
    List<List<Integer>> results;
    public List<List<Integer>> subsets(int[] nums) {
        results = new ArrayList();
        LinkedList<Integer> temp = new LinkedList();
        subsetsHelper(nums, 0, temp);
        return results;
    }

    private void subsetsHelper(int[] nums, int start, LinkedList<Integer> temp){
        results.add(new ArrayList(temp));
        if(start == nums.length){
            return;
        }
        for(int i = start ; i < nums.length ; i ++){
            temp.add(nums[i]);
            subsetsHelper(nums, i + 1 , temp);
            temp.removeLast();
        }
    }
}
