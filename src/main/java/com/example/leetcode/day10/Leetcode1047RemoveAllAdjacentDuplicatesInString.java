package com.example.leetcode.day10;

import java.util.Stack;

public class Leetcode1047RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }

        }
        char[] charArray = new char[stack.size()];
        for(int i = charArray.length -1 ; i >= 0 ; i --){
            charArray[i] = stack.pop();
        }
        return new String(charArray);
    }
}
