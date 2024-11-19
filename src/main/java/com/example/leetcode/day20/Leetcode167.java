package com.example.leetcode.day20;

public class Leetcode167 {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int numberLeft = numbers[left];
            int numberRight = numbers[right];

            if ((numberLeft + numberRight) < target) {
                left++;
            } else if ((numberLeft + numberRight) > target) {
                right--;
            } else {
                result[0] = (left + 1);
                result[1] = (right + 1);
                break;
            }
        }
        return result;
    }
}
