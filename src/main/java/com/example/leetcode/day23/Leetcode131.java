//package com.example.leetcode.day23;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Leetcode131 {
//    //    List<List<String>> result;
////
////    public List<List<String>> partition(String s) {
////        result = new ArrayList();
////        List<String> temp = new LinkedList();
////        partition(s, 0, temp);
////        return result;
////    }
////
////    private void partition(String s, int startIndex, List<String> temp) {
////
////        if (startIndex == s.length()) {
////            if (isPalindrome(temp)) {
////                result.add(new ArrayList(temp));
////            }
////            return;
////        }
////        for (int i = startIndex; i < s.length(); i++) {
////            temp.add(s.substring(startIndex, i + 1));
////            partition(s, i + 1, temp);
////            temp.removeLast();
////        }
////    }
////
////    private boolean isPalindrome(List<String> temp) {
////        for (String s : temp) {
////            if (!isPalindrome(s)) {
////                return false;
////            }
////        }
////        return true;
////    }
////
////    private boolean isPalindrome(String s) {
////        int left = 0;
////        int right = s.length() - 1;
////
////        while (left < right) {
////            if (s.charAt(left) != s.charAt(right)) {
////                return false;
////            }
////            left++;
////            right--;
////        }
////        return true;
////    }
//    List<List<String>> result;
//
//    public List<List<String>> partition(String s) {
//        result = new ArrayList();
//        List<String> temp = new LinkedList();
//        partition(s, 0, temp);
//        return result;
//    }
//
//    private void partition(String s, int startIndex, List<String> temp) {
//
//        if (startIndex == s.length()) {
//            result.add(new ArrayList(temp));
//            return;
//        }
//        for (int i = startIndex; i < s.length(); i++) {
//            String partition = s.substring(startIndex, i + 1);
//            if (!isPalindrome(partition)) {
//                continue;
//            }
//            temp.add(s.substring(startIndex, i + 1));
//            partition(s, i + 1, temp);
//            temp.removeLast();
//        }
//    }
//
//    private boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}
