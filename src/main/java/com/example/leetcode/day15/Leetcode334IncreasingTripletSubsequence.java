package com.example.leetcode.day15;

public class Leetcode334IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i : nums){
            if(i <= first){
                first = i;
            }else if(i <= second){
                second = i;
            }else{
                return true;// i < first && i>second
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));

    }
}
