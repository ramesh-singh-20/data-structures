package com.alphacoder;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();

        System.out.println(tree.isEmpty());
        tree.countNodes();
        tree.insert(12);
        tree.countNodes();
        tree.insert(9);
        tree.countNodes();
        tree.insert(15);
        tree.countNodes();
        tree.insert(10);
        tree.countNodes();
        System.out.println(tree.isEmpty());
        tree.bfs();
        tree.inOrderTraversal();
        tree.search(19);
    }
}
