package com.example.leetcode.day22;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
    List<String> results = new ArrayList();
    public List<String> letterCombinations(String digits) {

        if(digits.length() == 0){
            return results;
        }
        String[] nameString = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinationsHelper(digits, nameString, 0);
        return results;
    }
    StringBuilder temp = new StringBuilder();

    private void letterCombinationsHelper(String digits, String[] nameString, int num) {
        if(num == digits.length()){
            results.add(temp.toString());
            return;
        }
        char c = digits.charAt(num);
        String s = nameString[(c - '0') - 2];

        for(char letter : s.toCharArray()){
            temp.append(letter);
            letterCombinationsHelper(digits, nameString, num + 1);
            temp.deleteCharAt(temp.length() -1);
        }
    }
}
