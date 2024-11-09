package com.example.leetcode.day10;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode225ImplementStackusingQueues {
    class MyStack1 {
        private Queue<Integer> queue;

        public MyStack1() {
            queue = new LinkedList();
        }

        public void push(int x) {
            Queue<Integer> tempQueue = new LinkedList();
            while (!queue.isEmpty()) {
                tempQueue.offer(queue.poll());
            }
            queue.offer(x);

            while (!tempQueue.isEmpty()) {
                queue.offer(tempQueue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
