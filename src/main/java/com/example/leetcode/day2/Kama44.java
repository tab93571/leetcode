package com.example.leetcode.day2;

import java.util.Scanner;

public class Kama44 {
    //brute force
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] lands = new int[n][m];
//
//        int minDifference = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                lands[i][j] = scanner.nextInt();
//            }
//        }
//        for (int k = 0; k < n - 1; k++) {
//            int aLand = 0;
//            int bLand = 0;
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (i <= k) {
//                        aLand += lands[i][j];
//                    } else {
//                        bLand += lands[i][j];
//                    }
//                }
//            }
//            minDifference = Math.min(minDifference, Math.abs(aLand - bLand));
//
//        }
//        for (int k = 0; k < m - 1; k++) {
//            int aLand = 0;
//            int bLand = 0;
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (j <= k) {
//                        aLand += lands[i][j];
//                    } else {
//                        bLand += lands[i][j];
//                    }
//                }
//            }
//            minDifference = Math.min(minDifference, Math.abs(aLand - bLand));
//        }
//        System.out.println(minDifference);
//    }
//row sum, column sum
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] lands = new int[n][m];

        int minDifference = Integer.MAX_VALUE;
        int[] columnSum = new int[m];
        int[] rowSum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lands[i][j] = scanner.nextInt();
                columnSum[j] += lands[i][j];
                rowSum[i] += lands[i][j];
            }
        }

        for (int k = 0; k < n - 1; k++) {
            int aLand = 0;
            int bLand = 0;
            for (int i = 0; i < n; i++) {
                if (i <= k) {
                    aLand += rowSum[i];
                } else {
                    bLand += rowSum[i];
                }
            }

            minDifference = Math.min(minDifference, Math.abs(aLand - bLand));
        }


        for (int k = 0; k < m - 1; k++) {
            int aLand = 0;
            int bLand = 0;
            for (int j = 0; j < m; j++) {
                if (j <= k) {
                    aLand += columnSum[j];
                } else {
                    bLand += columnSum[j];
                }
            }
            minDifference = Math.min(minDifference, Math.abs(aLand - bLand));
        }
        System.out.println(minDifference);
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] lands = new int[n][m];
//        int sum = 0;
//
//        int minDifference = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                lands[i][j] = scanner.nextInt();
//                sum += lands[i][j];
//            }
//        }
//        int tempSumRow = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                tempSumRow++;
//                if (j == (m - 1)) {
//                    minDifference = Math.min(minDifference, Math.abs(sum - 2 * tempSumRow));
//                }
//
//            }
//        }
//        int tempSumColumn = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                tempSumColumn++;
//                if (j == (n - 1)) {
//                    minDifference = Math.min(minDifference, Math.abs(sum - 2 * tempSumColumn));
//                }
//            }
//        }
//        System.out.println(minDifference);
//    }
}
