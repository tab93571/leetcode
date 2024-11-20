package com.example.leetcode.day22;

import java.util.*;

public class Leetcode735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();

        for(int asteroid : asteroids){
            if(asteroid > 0){
                stack.push(asteroid);
            }else{
                while(!stack.isEmpty() &&stack.peek() > 0 && -1* asteroid > stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(asteroid);
                }else{
                    if(stack.peek() == -1 * asteroid){
                        stack.pop();
                    }
                }
            }
        }
        int[]results = new int[stack.size()];
        for(int i = results.length - 1 ; i >= 0 ; i --){
            results[i] = stack.pop();
        }

        return results;
    }
}
