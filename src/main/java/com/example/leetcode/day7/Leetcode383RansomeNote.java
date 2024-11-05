package com.example.leetcode.day7;

public class Leetcode383RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineHash = new int[26];

        for(char c : magazine.toCharArray()){
            magazineHash[c - 'a'] ++;
        }

        for(char c : ransomNote.toCharArray()){
            magazineHash[c - 'a'] --;

            if(magazineHash[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
