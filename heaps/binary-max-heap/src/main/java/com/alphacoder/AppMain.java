package com.alphacoder;

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
    }
}
