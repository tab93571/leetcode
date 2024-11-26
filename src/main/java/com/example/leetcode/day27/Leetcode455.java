package com.example.leetcode.day27;

import java.util.Arrays;

public class Leetcode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int content = 0;
        int cookieIndex = s.length - 1;
        for (int i = g.length - 1; i >= 0 && cookieIndex >= 0; i--) {
            if (s[cookieIndex] >= g[i]) {
                content++;
                cookieIndex--;
            }
        }
        return content;
    }
}
