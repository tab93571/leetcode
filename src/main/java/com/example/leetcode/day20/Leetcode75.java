package com.example.leetcode.day20;

import java.util.HashMap;

public class Leetcode75 {
    //count
//    public void sortColors(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap();
//        map.put(0,0);
//        map.put(1,0);
//        map.put(2,0);
//
//        for(int num : nums){
//            map.put(num,map.get(num) + 1);
//        }
//
//        int idx = 0;
//        for(int i = 0 ; i < 3 ; i ++){
//            int frequency = map.get(i);
//            while(frequency > 0){
//                nums[idx] = i;
//                idx ++;
//                frequency --;
//            }
//        }
//    }
    public void sortColors(int[] nums) {
        // 0, 1, and 2 to represent the color red, white, and blue

        int blue = nums.length -1;
        int red = 0;
        int white =0;

        while(white <= blue){
            if(nums[white]  > 1){
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue --;
            }else if(nums[white] == 1){
                white ++;
            }else{
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red ++;
                white ++;
            }
        }
    }
}
