package com.example.leetcode.day8;

public class Leetcode344ReverseString {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, charArray.length - 1);
            reverse(charArray, left, right);
        }

        return new String(charArray);
    }

    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
