package com.alphacoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxFrequentElements(new int[] {1, 2, 3, 1, 2, 5, 5, 3, 3}, 4)));

    }

    public static int [] maxFrequentElements(int [] arr, int K){
        int [] resultArr= new int[K];
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], 1+map.get(arr[i]));
            }else{
                map.put(arr[i], 1);
            }

        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue= new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            queue.add(entry);
        }

        for(int i=0; i< K; i++){
            resultArr[i]= queue.poll().getKey();
        }

        return resultArr;

    }

}
