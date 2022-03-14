package com.alphacoder;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        BubbleSort sort= new BubbleSort();

        System.out.println(Arrays.toString(sort.bubbleSort(new int[]{})));
    }
}
