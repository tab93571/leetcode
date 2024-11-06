package com.example.leetcode.day2;


import java.util.Scanner;

//https://kamacoder.com/problempage.php?pid=1070
//O(n + m)
//m is the amount of queries
// if we use brute force (vec) it will be O(n * m)
//for (int i = a; i <= b; i++) {
//        sum += vec[i];
//        }
public class Kama58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
//        int[] vec = new int[n];
        int presum = 0;
        for (int i = 0; i < n; i++) {
//            vec[i] = scanner.nextInt();
            presum += scanner.nextInt();
            p[i] = presum;
        }
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum;
            if (a == 0) {
                sum = p[b];
            } else {
                sum = p[b] - p[a - 1];
            }
            System.out.println(sum);
        }
        scanner.close();
    }

}
