package com.example.leetcode.day30;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode763 {
    //左邊排序
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        for(int i = 1 ; i < intervals.length ; i ++){
            if(intervals[i][0] < intervals[i -1][1]){
                count ++;
                intervals[i][1] = Math.min(intervals[i -1][1],intervals[i][1]);
            }
        }
        return count;
    }
}
