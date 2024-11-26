package com.example.leetcode.day24;

import com.example.leetcode.day1.ListNode;

public class Leetcode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        } else {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
    }
}
