package com.example.leetcode.day31;

public class Leetcode738 {
    //brute force
//    public int monotoneIncreasingDigits(int n) {
//
//        for (int i = n; i >= 0; i--) {
//            if (checkNum(i)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    private boolean checkNum(int i) {
//        int max = 10;
//        while (i > 0) {
//            int t = i % 10;
//            if (t <= max) {
//                max = t;
//            } else {
//                return false;
//            }
//            i /= 10;
//        }
//        return true;
//    }
    public int monotoneIncreasingDigits(int n) {
        String[] stringArray = (n + "").split("");

        int start = stringArray.length;

        for (int i = stringArray.length - 1; i > 0; i--) {
            if (Integer.parseInt(stringArray[i]) < Integer.parseInt(stringArray[i - 1])) {
                stringArray[i - 1] = Integer.parseInt(stringArray[i - 1]) - 1 + "";
                start = i;
            }
        }
        for (int i = start; i < stringArray.length; i++) {
            stringArray[i] = "9";
        }
        return Integer.parseInt(String.join("", stringArray));
    }

    //charArray
//    public int monotoneIncreasingDigits(int n) {
//        String s = String.valueOf(n);
//        char[] charArray = s.toCharArray();
//        int start = charArray.length;
//
//        for (int i = charArray.length - 1; i > 0; i--) {
//            if (charArray[i] < charArray[i - 1]) {
//                charArray[i - 1]--;
//                start = i;
//            }
//        }
//        for (int i = start; i < charArray.length; i++) {
//            charArray[i] = '9';
//        }
//        return Integer.parseInt(String.valueOf(charArray));
//    }

    public static void main(String[] args) {
        new Leetcode738().monotoneIncreasingDigits(1274);
    }
}
