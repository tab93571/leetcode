package com.example.leetcode.day7;


//● 看到題目時的第一個想法
//● 閱讀完代碼隨想錄後的想法
//● 在實現過程中遇到的困難
//● 今天的收穫，記錄一下學習時長


import java.util.HashMap;
import java.util.Map;

public class Leetcode4544SumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        Map<Integer, Integer> sumFrequency = new HashMap();
        for(int i : nums1){
            for(int j : nums2){
                int sum = i + j;
                sumFrequency.put(sum, sumFrequency.getOrDefault(sum, 0) + 1);
            }
        }

        for(int i : nums3){
            for(int j : nums4){
                int sum = i + j;
                result += sumFrequency.getOrDefault(-sum, 0);
            }
        }
        return result;


    }
}
