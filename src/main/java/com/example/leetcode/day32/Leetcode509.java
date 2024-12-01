package com.example.leetcode.day32;

public class Leetcode509 {
//    public int fib(int n) {
//        if(n == 0){
//            return 0;
//        }
//        else if(n ==1){
//            return 1;
//        }
//        return fib(n -1) + fib(n -2);
//    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
}
