package com.alphacoder;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        SelectionSort sort= new SelectionSort();
        System.out.println(Arrays.toString(sort.selectionSort(new int[]{4, 1})));
    }
}
