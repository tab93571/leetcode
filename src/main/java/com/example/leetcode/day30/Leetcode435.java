package com.example.leetcode.day30;

import java.util.ArrayList;
import java.util.List;

public class Leetcode435 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList();
        int[] lastAppear = new int[26];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            lastAppear[charArray[i] - 'a'] = i;
        }

        int lastAppearPartition = 0;
        int start = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (lastAppear[charArray[i] - 'a'] > lastAppearPartition) {
                lastAppearPartition = lastAppear[charArray[i] - 'a'];
            }
            if (i == lastAppearPartition) {
                result.add(lastAppearPartition - start + 1);
                start = lastAppearPartition + 1;
                lastAppearPartition = 0;
            }
        }
        return result;
    }
}
