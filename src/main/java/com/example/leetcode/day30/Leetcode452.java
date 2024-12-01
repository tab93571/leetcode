package com.example.leetcode.day30;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                count++;
            } else {
                points[i][1] = Math.min(points[i - 1][1], points[i][1]);
            }
        }
        return count;
    }
}
