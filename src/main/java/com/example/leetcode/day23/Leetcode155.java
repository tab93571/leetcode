package com.example.leetcode.day23;

import java.util.Stack;

public class Leetcode155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public Leetcode155() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        int popValue = stack.pop();
        if(popValue == minStack.peek()){
            minStack.pop();
        }
    }
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
