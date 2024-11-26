package com.example.leetcode.day24;

import com.example.leetcode.day1.ListNode;

public class Leetcode237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
