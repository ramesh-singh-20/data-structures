package com.alphacoder;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        MaxHeap heap= new MaxHeap();
        heap.insert(4);
        heap.insert(8);
        heap.insert(5);

        System.out.println("Max element: "+heap.getMax());
        System.out.println("Size: "+heap.getSize());
        System.out.println("Is Empty: "+heap.isEmpty());
        System.out.println("Extract Max: "+ heap.extractMax());
        System.out.println("*************************************");
        System.out.println("Max element: "+heap.getMax());
        System.out.println("Size: "+heap.getSize());
        System.out.println("Is Empty: "+heap.isEmpty());
        System.out.println("Extract Max: "+ heap.extractMax());
        System.out.println("*************************************");
        System.out.println("Max element: "+heap.getMax());
        System.out.println("Size: "+heap.getSize());
        System.out.println("Is Empty: "+heap.isEmpty());
        System.out.println("Extract Max: "+ heap.extractMax());
        System.out.println("*************************************");
        System.out.println("Size: "+heap.getSize());
        System.out.println("Is Empty: "+heap.isEmpty());

        System.out.println(Arrays.toString(heap.heapSort(new int[]{59, 2, 6, 9, 3, 59, 23, 54})));



    }
}
