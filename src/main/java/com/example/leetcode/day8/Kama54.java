package com.example.leetcode.day8;

import java.util.Scanner;

public class Kama54 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String m = scanner.nextLine();
//        char[] charArray = m.toCharArray();
//        StringBuilder builder = new StringBuilder("");
//
//        for (char c : charArray) {
//            if (Character.isDigit(c)) {
//                builder.append("number");
//            } else {
//                builder.append(c);
//            }
//        }
//
//        System.out.println(builder);
//        scanner.close();
//    }

    //運用雙指針
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                length += 5;
            }
        }
        char[] retCharArray = new char[length];

        for (int i = s.length() - 1, j = length - 1; i >= 0; i--) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                retCharArray[j--] = 'r';
                retCharArray[j--] = 'e';
                retCharArray[j--] = 'b';
                retCharArray[j--] = 'm';
                retCharArray[j--] = 'u';
                retCharArray[j--] = 'n';
            } else {
                retCharArray[j--] = s.charAt(i);
            }
        }
        System.out.println(retCharArray);
    }
}
