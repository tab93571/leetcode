package com.example.leetcode.day11;

import java.util.Stack;

public class Leetcode150EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for (String token : tokens) {
            if (token.equals("+")) {
                int firstPop = stack.pop();
                int secondPop = stack.pop();
                stack.push(secondPop + firstPop);
            } else if (token.equals("-")) {
                int firstPop = stack.pop();
                int secondPop = stack.pop();
                stack.push(secondPop - firstPop);
            } else if (token.equals("*")) {
                int firstPop = stack.pop();
                int secondPop = stack.pop();
                stack.push(secondPop * firstPop);
            } else if (token.equals("/")) {
                int firstPop = stack.pop();
                int secondPop = stack.pop();
                stack.push(secondPop / firstPop);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
