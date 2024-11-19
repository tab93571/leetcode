package com.example.leetcode.day18;

import java.util.Arrays;

public class Leetcode42 {
    //brute  force
//    public int trap(int[] height) {
//        int sum = 0;
//        for (int i = 0; i < height.length; i++) {
//            int leftHighest = 0;
//            int rightHighest = 0;
//            for (int j = i - 1; j >= 0; j--) {
//                if (height[j] > leftHighest) {
//                    leftHighest = height[j];
//                }
//            }
//            for (int j = i + 1; j < height.length; j++) {
//                if (height[j] > rightHighest) {
//                    rightHighest = height[j];
//                }
//            }
//            int lowerBorder = Math.min(rightHighest, leftHighest);
//            sum += lowerBorder - height[i] > 0 ? lowerBorder - height[i] : 0;
//
//        }
//        return sum;
//    }


//    public int trap(int[] height) {
//        int trap = 0;
//        int[] maxLeft = new int[height.length];
//        int[] maxRight = new int[height.length];
//
//        for (int i = 1; i < height.length; i++) {
//            maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
//        }
//
//        for (int i = height.length - 2; i >= 0; i--) {
//            maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);
//        }
//
//        for (int i = 0; i < height.length; i++) {
//            int minimum = Math.min(maxLeft[i], maxRight[i]);
//            int water = (minimum - height[i]) > 0 ? minimum - height[i] : 0;
//            trap += water;
//        }
//
//        return trap;
//    }

    //    public int trap(int[] height) {
//        int trap = 0;
//        int left = 0;
//        int right = height.length - 1;
//        int maxLeft = height[left];
//        int maxRight = height[right];
//
//        while (left < right) {
//            if (maxLeft < maxRight) {
//                left++;
//                trap += (maxLeft - height[left]) > 0 ? maxLeft - height[left] : 0;
//                if (height[left] > maxLeft) {
//                    maxLeft = height[left];
//                }
//
//            } else {
//                right--;
//                trap += (maxRight - height[right]) > 0 ? maxRight - height[right] : 0;
//                if (height[right] > maxRight) {
//                    maxRight = height[right];
//                }
//            }
//        }
//        return trap;
//    }
    public int trap(int[] height) {
        int trap = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (left <= right) {
            if (maxLeft < maxRight) {

                trap += (maxLeft - height[left]) > 0 ? maxLeft - height[left] : 0;
                if (height[left] > maxLeft) {
                    maxLeft = height[left];
                }
                left++;

            } else {

                trap += (maxRight - height[right]) > 0 ? maxRight - height[right] : 0;
                if (height[right] > maxRight) {
                    maxRight = height[right];
                }
                right--;
            }
        }
        return trap;
    }
}
