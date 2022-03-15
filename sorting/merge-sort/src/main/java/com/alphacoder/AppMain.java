package com.alphacoder;

import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {
        MergeSort mergeSort= new MergeSort();

        int [] arr= new int[]{1, 9, 5, 4, 2, 78, 32, 54};
        System.out.println(Arrays.toString(mergeSort.mergeSort(arr)));

    }
}
