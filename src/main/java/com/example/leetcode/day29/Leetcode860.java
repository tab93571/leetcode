package com.example.leetcode.day29;

public class Leetcode860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCount++;
            } else if (bills[i] == 10) {
                tenCount++;
                if (fiveCount > 0) {
                    fiveCount--;
                } else {
                    return false;
                }
            } else {
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
