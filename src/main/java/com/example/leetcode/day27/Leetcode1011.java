package com.example.leetcode.day27;

import java.util.Arrays;

public class Leetcode1011 {
    public int shipWithinDays(int[] weights, int days) {
        int minLoad = Arrays.stream(weights).max().getAsInt();
        int maxLoad = Arrays.stream(weights).sum();

        while(minLoad <= maxLoad){
            int middle = (minLoad + maxLoad)/2;
        }

        return -2;
    }

    private int calculateDays(int[] weights, int load){
        int days = 1;
        int leftLoad = load;
        for(int weight : weights){
            if(leftLoad < weight){
                leftLoad = load;
                days ++;
            }
            leftLoad = leftLoad - weight;
        }
        return days;
    }

    public static void main(String[] args) {
        new Leetcode1011().calculateDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 15);
    }
}
