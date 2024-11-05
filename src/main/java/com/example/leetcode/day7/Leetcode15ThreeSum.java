package com.example.leetcode.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//去重操作 why nums[i] == nums[i - 1] instead of nums[i] == nums[i + 1],   [-1, -1, 2]

public class Leetcode15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList();
        if (nums[0] > 0) {
            return results;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                long sum = (long) nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    results.add(new ArrayList(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    //left < right necessary, [0,0,0]
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return results;
    }
}
