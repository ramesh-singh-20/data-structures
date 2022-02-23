package com.alphacoder;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();

        System.out.println(tree.isEmpty());
        tree.insert(12);
        tree.insert(9);
        tree.insert(15);
        tree.insert(10);
        System.out.println(tree.isEmpty());
        tree.bfs();
    }
}
