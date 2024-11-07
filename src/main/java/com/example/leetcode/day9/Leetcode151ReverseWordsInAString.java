package com.example.leetcode.day9;

public class Leetcode151ReverseWordsInAString {
//            移除多余空格
//            将整个字符串反转
//            将每个单词反转

    public String reverseWords(String s) {
        StringBuilder builder = removeSpace(s);
        reverse(0, builder.length() - 1, builder);
        reverseEachWord(builder);
        return builder.toString();
    }
    private StringBuilder removeSpace(String s) {
        StringBuilder b = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;

        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        while (start <= end) {
            if (s.charAt(start) != ' ' || b.charAt(b.length() - 1) != ' ') {
                b.append(s.charAt(start));
            }
            start++;
        }
        return b;
    }

    private void reverse(int start, int end, StringBuilder builder) {
        while (start < end) {
            char temp = builder.charAt(start);
            builder.setCharAt(start, builder.charAt(end));
            builder.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private void reverseEachWord(StringBuilder builder) {
        int start = 0;
        int n = builder.length();
        int end = 1;

        while (start < n) {
            while (end < n && builder.charAt(end) != ' ') {
                end++;
            }
            reverse(start, end - 1, builder);
            start = end + 1;
            end = start + 1;
        }
    }
}
