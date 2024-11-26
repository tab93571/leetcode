package com.example.leetcode.day25;

import com.example.leetcode.day1.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode234 {
    //extra space
//    public boolean isPalindrome(ListNode head) {
//
//        List<Integer> list = new ArrayList();
//
//        while(head != null){
//            list.add(head.val);
//            head = head.next;
//        }
//        return isPalindrome(list);
//
//    }
//    private boolean isPalindrome(List<Integer> list){
//        int start = 0;
//        int end = list.size() -1;
//        while(start < end){
//            if(list.get(start) != list.get(end)){
//                return false;
//            }
//            start ++;
//            end --;
//        }
//        return true;
//    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = null;
        ListNode cur = slow;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode reverseHalf = prev;
        ListNode firstHalf = head;

        while (reverseHalf != null) {
            if (reverseHalf.val != firstHalf.val) {
                return false;
            }
            reverseHalf = reverseHalf.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }
}
