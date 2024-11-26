package com.example.leetcode.day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode93 {
    static List<String> result;

    public static List<String> restoreIpAddresses(String s) {
        result = new ArrayList();
        LinkedList<Long> temp = new LinkedList();
        restoreIpAddressHelper(s, temp, 0);
        return result;

    }

    private static void restoreIpAddressHelper(String s, LinkedList<Long> temp, int startIndex) {
        if (startIndex == s.length()) {
            if (temp.size() == 4) {
                result.add(String.join(".", temp.stream().map(String::valueOf).toArray(String[]::new)));
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {

            long value;
            if (temp.size() == 3 && Long.valueOf(s.substring(startIndex, startIndex + 1)) != 0) {
                value = Long.valueOf(s.substring(startIndex));
                i = s.length() - 1;
            } else {
                value = Long.valueOf(s.substring(startIndex, i + 1));
            }

            if (value <= 255) {
                temp.add(value);
                restoreIpAddressHelper(s, temp, i + 1);
                temp.removeLast();
                if (value == 0) {
                    break;
                }
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        restoreIpAddresses("101023");
    }
}
