package com.example.leetcode.day29;

import java.util.Arrays;

public class Leetcode135 {
    public int candy(int[] ratings) {
        int[] candyArray = new int[ratings.length];
        candyArray[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            candyArray[i] = (ratings[i] > ratings[i - 1]) ?
                    candyArray[i - 1] + 1 : 1; //right > left
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candyArray[i] = Math.max(candyArray[i + 1] + 1, candyArray[i]);
            } //left > right
        }
        return Arrays.stream(candyArray).sum();
    }
}
