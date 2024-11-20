package com.example.leetcode.day22;

import java.util.Stack;

public class Leetcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] results = new int[nums.length];
        Stack<Integer> stack = new Stack();

        for(int i = 0 ; i < nums.length ; i ++){
            results[i] = -1;
        }

        for(int i = 0 ; i < 2 * nums.length -1 ; i ++){
            while(!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek()]){
                results[stack.pop()] = nums[i % nums.length];
            }
            if(i < nums.length){
                stack.push(i);
            }
        }
        return results;
    }
}
