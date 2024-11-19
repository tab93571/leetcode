package com.example.leetcode.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int leftNumber = nums[left];
                int rightNumber = nums[right];
                if (leftNumber + rightNumber + nums[i] < 0) {
                    left++;
                } else if (leftNumber + rightNumber + nums[i] > 0) {
                    right--;
                } else {
                    List<Integer> result = new ArrayList();
                    result.add(nums[i]);
                    result.add(leftNumber);
                    result.add(rightNumber);
                    results.add(result);

                    left++;
                    right--;

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

    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

}
