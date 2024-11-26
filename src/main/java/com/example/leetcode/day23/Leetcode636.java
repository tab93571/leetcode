package com.example.leetcode.day23;

import java.util.List;
import java.util.Stack;

public class Leetcode636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] results = new int[n];
        Stack<Integer> stack = new Stack();
        int prevTime = 0;
        for(String s : logs){
            String[] sArray = s.split(":");
            int id = Integer.parseInt(sArray[0]);
            String instruction = sArray[1];
            int curTime = Integer.parseInt(sArray[2]);
            if(instruction.equals("start")){
                if(!stack.isEmpty()){
                    results[stack.peek()] += curTime - prevTime;
                }
                stack.push(id);
                prevTime = curTime;
            }else{
                results[stack.pop()] += curTime - prevTime + 1;
                prevTime = curTime + 1;
            }
        }
        return results;
    }
}
