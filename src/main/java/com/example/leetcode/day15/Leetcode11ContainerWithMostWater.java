package com.example.leetcode.day15;

public class Leetcode11ContainerWithMostWater {
    //brute force
//    public int maxArea(int[] height) {
//        int maxWather = 0;
//        for(int i = 0 ; i < height.length ; i ++){
//            for(int j = 1; j < height.length ; j ++){
//                maxWather = Math.max(Math.min(height[i], height[j]) * (j - i), maxWather);
//            }
//        }
//        return maxWather;
//    }

    //two pointer

    public int maxArea(int[] height) {
        int maxWather = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            maxWather = Math.max(Math.min(height[left], height[right]) * (right - left), maxWather);

            if(height[left] < height[right]){
                left ++;
            }else if(height[left] > height[right]){
                right --;
            }else{
                left ++;
                right --;
            }
        }
        return maxWather;
    }
}
