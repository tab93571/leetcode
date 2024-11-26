package com.example.leetcode.day25;

import com.example.leetcode.day1.ListNode;

public class Leetcode143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode middle = slow;

        ListNode prev = null;
        ListNode cur = middle;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode reverseHalf = prev; // New head of the reversed second half.

        ListNode firstHalf = head;
        while (reverseHalf != null && reverseHalf.next != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = reverseHalf.next;

            firstHalf.next = reverseHalf;
            reverseHalf.next = temp1;

            firstHalf = temp1;
            reverseHalf = temp2;
        }
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
//        five.next = six;
        new Leetcode143().reorderList(one);

    }
}
