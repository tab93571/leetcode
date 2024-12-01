package com.example.leetcode.day29;

public class Leetcode134 {
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//
//        for(int i = 0 ; i < gas.length ; i ++){
//            int tank = 0;
//            int index = 0;
//            while(index < gas.length){
//                tank += gas[(i + index) % gas.length];
//                tank -= cost[(i + index) % gas.length];
//                if(tank < 0){
//                    break;
//                }
//                index ++;
//            }
//            if(tank >= 0){
//                return i;
//            }
//        }
//        return -1;
//    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int current = 0;
        int index = 0;

        for(int i = 0 ; i < gas.length ; i ++){
            int remain = gas[i] - cost[i];
            current += remain;
            total += remain;

            if(current < 0) {
                current = 0;
                index = i + 1;
            }
        }

        return total < 0 ? -1 : index;
    }

    public static void main(String[] args) {
        new Leetcode134().canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
    }
}
