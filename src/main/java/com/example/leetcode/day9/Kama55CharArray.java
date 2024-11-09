package com.example.leetcode.day9;

public class Kama55CharArray {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        chars = removeExtraSpaces(chars);
        reverse(chars, 0, chars.length - 1);
        reverseEachWord(chars);

        // Step 3: Clean up spaces and build the final result
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public void reverseEachWord(char[] chars) {
        int start = 0;
        for (int end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
    }

    public char[] removeExtraSpaces(char[] chars) {
        int insertionIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            //先用 fast 移除所有空格
            if (chars[i] != ' ') {
                if(insertionIndex != 0){
                    chars[insertionIndex] = ' ';
                    insertionIndex ++;
                }
            }
            while(i < chars.length && chars[i] != ' '){
                chars[insertionIndex] = chars[i];
                insertionIndex ++;
                i ++;
            }
        }
        char[] newChars = new char[insertionIndex];
        System.arraycopy(chars, 0, newChars, 0, insertionIndex);
        return newChars;
    }
}
