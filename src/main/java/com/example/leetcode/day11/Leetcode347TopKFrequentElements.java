package com.example.leetcode.day11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        Map<Integer, Integer> map = new HashMap();
        int[] result = new int[k];
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int[] array = new int[2];
            array[0] = entry.getKey();
            array[1] = entry.getValue();

            if(pq.size() < k){
                pq.offer(array);
            }else{
                if(pq.peek()[1] < array[1]){
                    pq.poll();
                    pq.offer(array);
                }
            }
        }
        for(int i = 0 ; i < k ; i ++){
            result[i] = pq.poll()[0];
        }
        return result;
    }
}
