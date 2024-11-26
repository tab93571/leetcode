package com.example.leetcode.day24;

import com.example.leetcode.day1.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode141 {
    //ultra space
    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet();
        ListNode node = head;

        while(node != null){
            if(set.contains(node)){
                return true;
            }
            set.add(node);
            node = node.next;
        }
        return false;
    }
//    O(1) space

//    public boolean hasCycle(ListNode head) {
//
//        if(head == null){
//            return false;
//        }
//
//        ListNode firstPointer = head;
//        ListNode secondPointer = head;
//
//        while(firstPointer.next != null && secondPointer.next != null && secondPointer.next.next != null){
//            firstPointer = firstPointer.next;
//            secondPointer = secondPointer.next.next;
//
//            if(firstPointer == secondPointer){
//                return true;
//            }
//        }
//        return false;
//    }
}
