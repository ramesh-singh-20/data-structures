package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        BinarySearch search= new BinarySearch();

        System.out.println(search.binarySearchIterative(new int[] {2, 6, 8, 19, 34, 56, 76}, -19));
        System.out.println(search.binarySearchIterative(new int[] {}, -19));
        System.out.println(search.binarySearchIterative(new int[] {2, 6, 8, 19, 34, 56}, 56));


        System.out.println(search.binarySearchRecursive(new int[] {2, 6, 8, 19, 34, 56}, 34, 0, 5));
        System.out.println(search.binarySearchRecursive(new int[] {-19}, -19, 0, 0));
    }
}
