package com.example.leetcode.day21;

import java.util.Stack;

public class Leetcode739 {
    //brute force
//    public int[] dailyTemperatures(int[] temperatures) {
//        int[] answer = new int[temperatures.length];
//
//        for(int i = 0 ; i < temperatures.length ; i ++){
//            int count = 0;
//            for(int j = i + 1; j < temperatures.length ; j ++){
//                count ++;
//                if(temperatures[j] > temperatures[i]){
//                    answer[i] = count;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        for(int i = 0 ; i < temperatures.length ; i ++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int pop = stack.pop();
                answer[pop] = i-pop;
            }
            stack.push(i);
        }
        return answer;
    }
}
