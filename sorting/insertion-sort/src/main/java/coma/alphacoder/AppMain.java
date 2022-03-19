package coma.alphacoder;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        InsertionSort sort= new InsertionSort();

        System.out.println(Arrays.toString(sort.insertionSort(new int[] {3, 6, 1, 76, 34, 65, 78})));
    }
}
