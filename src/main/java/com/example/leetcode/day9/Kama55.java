package com.example.leetcode.day9;

import java.util.Scanner;
//https://kamacoder.com/problempage.php?pid=1065
public class Kama55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int length = s.length();
        char[] charArray = s.toCharArray();
        reverse(0, length - 1, charArray);
        reverse(0, k - 1, charArray);
        reverse(k, length - 1, charArray);
        System.out.println(new String(charArray));
    }

    private static void reverse(int start, int end, char[] charArray) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}
