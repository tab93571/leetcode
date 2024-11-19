package com.example.leetcode.day10;

import java.util.ArrayDeque;
import java.util.Stack;

public class Leetcode1047RemoveAllAdjacentDuplicatesInString {
//    public String removeDuplicates(String s) {
//        Stack<Character> stack = new Stack();
//        for(char c : s.toCharArray()){
//            if(!stack.isEmpty() && stack.peek() == c){
//                stack.pop();
//            }
//            else{
//                stack.push(c);
//            }
//
//        }
//        char[] charArray = new char[stack.size()];
//        for(int i = charArray.length -1 ; i >= 0 ; i --){
//            charArray[i] = stack.pop();
//        }
//        return new String(charArray);
//    }


//    public static String removeDuplicates(String S) {
//        //ArrayDeque会比LinkedList在除了删除元素这一点外会快一点
//        //参考：https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
//        ArrayDeque<Character> deque = new ArrayDeque<>();
//        char ch;
//        for (int i = 0; i < S.length(); i++) {
//            ch = S.charAt(i);
//            if (deque.isEmpty() || deque.peek() != ch) {
//                deque.push(ch);
//            } else {
//                deque.pop();
//            }
//        }
//        String str = "";
//        //剩余的元素即为不重复的元素
//        while (!deque.isEmpty()) {
//            str = deque.pop() + str;
//        }
//        return str;
//    }
    //top 是關鍵，是紀錄現在char array end的index

//    public String removeDuplicates(String s) {
//        // 将 res 当做栈
//        // 也可以用 StringBuilder 来修改字符串，速度更快
//        // StringBuilder res = new StringBuilder();
//        StringBuffer res = new StringBuffer();
//        // top为 res 的长度
//        int top = -1;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            // 当 top > 0,即栈中有字符时，当前字符如果和栈中字符相等，弹出栈顶字符，同时 top--
//            if (top >= 0 && res.charAt(top) == c) {
//                res.deleteCharAt(top);
//                top--;
//                // 否则，将该字符 入栈，同时top++
//            } else {
//                res.append(c);
//                top++;
//            }
//        }
//        return res.toString();
//    }

    //雙指針的做法完全想不到，很精妙

    //show為下一個要插入的

    public static String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        int fast = 0;
        int slow = 0;
        while(fast < s.length()){
            // 直接用fast指针覆盖slow指针的值
            ch[slow] = ch[fast];
            // 遇到前后相同值的，就跳过，即slow指针后退一步，下次循环就可以直接被覆盖掉了
            if(slow > 0 && ch[slow] == ch[slow - 1]){
                slow--;
            }else{
                slow++;
            }
            fast++;
        }
        return new String(ch,0,slow);
    }

    public static void main(String[] args) {
        removeDuplicates("azxxzy");

    }
}
