package coma.alphacoder;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        InsertionSort sort= new InsertionSort();

        System.out.println(Arrays.toString(sort.insertionSort(new int[] {3, 6, 1, 4, 2, 8, 5})));
    }
}
