package com.example.leetcode.day23;

public class Leetcode394 {
    static int i = 0;
    public static String decodeString(String s) {
        return decodeString(s, new StringBuilder()).toString();
    }

    private static StringBuilder decodeString(String s, StringBuilder builder) {
        int count = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (c < '9' && c >= '0') {
                count = count * 10 + c - '0';
            } else if (c == '[') {
                StringBuilder returnBuilder = decodeString(s, new StringBuilder());
                for (int i = 0; i < count; i++) {
                    builder.append(returnBuilder);
                }
                count = 0;

            } else if (c == ']') {
                return builder;

            } else {
                builder.append(c);
            }
        }
        return builder;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
