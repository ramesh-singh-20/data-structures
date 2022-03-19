package com.alphacoder;

import java.util.Arrays;


public class AppMain {
    public static void main(String[] args) {
        BubbleSort sort= new BubbleSort();

        System.out.println(Arrays.toString(sort.bubbleSort(new int[]{3,4,5,6, 76, 1, 5, 8, 1})));


    }
}
