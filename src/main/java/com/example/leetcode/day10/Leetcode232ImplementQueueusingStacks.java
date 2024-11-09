package com.example.leetcode.day10;

import java.util.Stack;

public class Leetcode232ImplementQueueusingStacks {
    class MyQueue {
        private Stack<Integer> writeStack;
        private Stack<Integer> readStack;

        public MyQueue() {
            writeStack = new Stack();
            readStack = new Stack();
        }

        public void push(int x) {
            writeStack.push(x);
        }

        public int pop() {
            dumpToRead();
            return readStack.pop();
        }

        public int peek() {
            dumpToRead();
            return readStack.peek();

        }
        public void dumpToRead() {
            if(!readStack.isEmpty()){
                return;
            }
            while(!writeStack.isEmpty()){
                readStack.push(writeStack.pop());
            }

        }
        public boolean empty() {
            return writeStack.isEmpty() && readStack.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
