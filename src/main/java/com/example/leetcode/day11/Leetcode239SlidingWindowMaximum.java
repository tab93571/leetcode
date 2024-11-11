package com.example.leetcode.day11;

import java.util.ArrayDeque;

public class Leetcode239SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int idx = 0;
        int[] result = new int[nums.length - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < nums.length ; i ++){

            if(!deque.isEmpty() && deque.peek() <= i - k){
                deque.poll();
            }

            //  while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){  <= can work because this poll is by index
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.removeLast();
            }
            deque.add(i);

            if(i >= k -1){
                result[idx] = nums[deque.peek()];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-7,-8,7,5,7,1,6,0};
        maxSlidingWindow(array,4);
    }

//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        MyQueue myQueue = new MyQueue();
//        int[] result = new int[nums.length - k + 1];
//        for(int i = 0 ; i < k ; i ++){
//            myQueue.add(nums[i]);
//        }
//        result[0] = myQueue.peek();
//
//        for(int i = k ; i < nums.length ; i ++){
//            myQueue.poll(nums[i - k]);
//            myQueue.add(nums[i]);
//            result[i - k + 1] = myQueue.peek();
//
//        }
//        return result;
//    }
}
//class MyQueue{
//    private ArrayDeque<Integer> deque;
//    public MyQueue(){
//        deque = new ArrayDeque<>();
//    }
//
//    public void poll(int val){
//        if(!deque.isEmpty() && deque.peek() == val){
//            deque.pop();
//        }
//    }
//
//    public void add(int val){
//        //  while(!deque.isEmpty() && val >= deque.peekLast()){  >= can not work
//        while(!deque.isEmpty() && val > deque.peekLast()){
//            deque.removeLast();
//        }
//        deque.add(val);
//    }
//    public int peek(){
//        return deque.peek();
//    }
//}
