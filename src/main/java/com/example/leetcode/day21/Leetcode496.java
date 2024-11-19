package com.example.leetcode.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode496 {
    //brute force
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//
//        for(int i = 0 ;i < nums1.length ; i ++){
//            ans[i] = -1;
//            boolean found = false;
//            for(int j = 0 ; j < nums2.length ; j ++){
//                if(nums1[i] == nums2[j]){
//                    found = true;
//               }
//                if(found && nums2[j] > nums1[i]){
//                    ans[i] = nums2[j];
//                    break;
//                }
//            }
//        }
//        return ans;
//    }
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        Map<Integer, Integer> map = new HashMap();
//        int[] ans = new int[nums1.length];
//
//        for(int i = 0 ; i < nums1.length ; i ++){
//            map.put(nums1[i] , i);
//        }
//
//        for(int i = 0 ; i < nums2.length ; i ++){
//            int number = nums2[i];
//            if(map.get(number) == null){
//                continue;
//            }
//            ans[map.get(number)] = -1;
//            for(int j = i + 1 ; j < nums2.length ; j ++){
//                if(nums2[j] > number){
//                    ans[map.get(number)] = nums2[j];
//                    break;
//                }
//            }
//        }
//        return ans;
//
//    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;
            map.put(nums1[i], i);
        }

        for (int i = 0; i < nums2.length; i++) {
            int number = nums2[i];
            while (!stack.isEmpty() && number > stack.peek()) {
                ans[map.get(stack.pop())] = number;
            }
            if (map.get(number) != null) {
                stack.push(number);
            }

        }
        return ans;
    }
}
