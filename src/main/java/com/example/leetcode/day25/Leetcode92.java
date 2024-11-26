package com.example.leetcode.day25;

import com.example.leetcode.day1.ListNode;

public class Leetcode92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1,head);
        ListNode beforeLeft = dummy;
        for(int i = 1 ; i < left ; i ++){
            beforeLeft = beforeLeft.next;
        }
        ListNode rightNode = head;
        for(int i = 1 ; i < right ; i ++){
            rightNode = rightNode.next;
        }
        ListNode afterRight = rightNode.next;

        ListNode cur = beforeLeft.next;
        ListNode prev = null;
        rightNode.next = null;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        beforeLeft.next.next = afterRight;
        beforeLeft.next = prev;
        return dummy.next;
    }



    public static void main(String[] args) {
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
//        ListNode six = new ListNode(6);
        one.next = two;
//        two.next = three;
//        three.next = four;
//        four.next = five;
//        five.next = six;
        new Leetcode92().reverseBetween(one,1,2);

    }
}
