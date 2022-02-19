package com.alphacoder;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(15);
        tree.insert(37);
        tree.insert(12);
        tree.insert(4);
        tree.insert(1);
        tree.insert(54);

        System.out.println(tree.search(4));
        System.out.println(tree.search(11));

        tree.min();
        tree.max();
        tree.height();
    }
}
