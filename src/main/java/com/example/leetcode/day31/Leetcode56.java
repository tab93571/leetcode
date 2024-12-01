package com.example.leetcode.day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> answer = new ArrayList();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            } else {
                answer.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        answer.add(new int[]{start, end});
        int[][] answerArray = new int[answer.size()][2];
        for (int i = 0; i < answer.size(); i++) {
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}
