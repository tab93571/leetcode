package com.example.leetcode.day28;

public class Leetcode852 {
    public int peakIndexInMountainArray(int[] arr) {
        int lower = 1;
        int upper = arr.length - 2;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new Leetcode852().peakIndexInMountainArray(new int[]{3, 4, 5, 1});
    }

}
