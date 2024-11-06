package com.example.leetcode.day2;

public class Leetcode59SpiralMatrixll {
    //    填充上行从左到右
//    填充右列从上到下
//    填充下行从右到左
//    填充左列从下到上
//    邊界上的四個點,規則要一樣
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int startX = 0; // row start
        int startY = 0; // colunm start
        int offset = 1;
        int loop = 1;
        int count = 1;
        int i, j;
        //row, column

        while (loop <= n / 2) {
            for (j = startY; j < n - offset; j++) {
                result[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                result[i][j] = count++;
            }
            for (; j > startY; j--) {
                result[i][j] = count++;
            }
            for (; i > startX; i--) {
                result[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if (n % 2 == 1) {
            result[startX][startY] = count;
        }
        return result;
    }

}
