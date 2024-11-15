package com.example.leetcode.day16;

public class Leetcode283 {

    //initial thought
//    public void moveZeroes(int[] nums) {
//        int insertIndex = 0;
//
//        for(int i = 0 ; i < nums.length ; i ++){
//            if(nums[i] != 0){
//                nums[insertIndex] = nums[i];
//                insertIndex ++;
//            }
//        }
//        for(int i = insertIndex ; i < nums.length ; i ++){
//            nums[i] = 0;
//        }
//    }
    public void moveZeroes(int[] nums) {
        int insertIndex = 0;

        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] != 0){
                nums[insertIndex] = nums[i];
                if(i != insertIndex){
                    nums[i] = 0;
                }
                insertIndex ++;
            }
        }
    }
//    public void moveZeroes(int[] nums) {
//        int insertIndex = 0;
//
//        for(int i = 0 ; i < nums.length ; i ++){
//            if(nums[i] != 0){
//                if(i != insertIndex){
//                    nums[insertIndex] = nums[i];
//                    nums[i] = 0;
//                }
//                insertIndex ++;
//            }
//        }
//
//    }
}
