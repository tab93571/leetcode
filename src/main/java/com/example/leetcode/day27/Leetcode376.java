package com.example.leetcode.day27;

public class Leetcode376 {
    public int wiggleMaxLength(int[] nums) {
        int result = 1;

        int preDiff = 0;
        int curDiff = 0;

        for(int i = 0 ; i < nums.length - 1 ; i ++){

            curDiff = nums[i + 1] - nums[i];

            // 平的時候刪掉左邊的
            if(preDiff <= 0 && curDiff > 0 || preDiff >= 0 && curDiff < 0){
                result ++;
                preDiff = curDiff;
            }
        }
        return result;
    }
}
