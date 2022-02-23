package com.alphacoder;

import java.util.*;

public class App {
    public static void main(String[] args) {

        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(12);
        tree.insert(5);
        tree.insert(14);
        tree.insert(3);
        tree.insert(7);
        tree.insert(13);
        tree.insert(17);
        tree.insert(1);
        tree.insert(9);
        tree.insert(20);
        tree.insert(8);
        tree.insert(11);
        tree.insert(18);

        System.out.println(tree.search(4));
        System.out.println(tree.search(11));

        tree.min();
        tree.max();
        tree.height();
        tree.breadthFirst();
        tree.preOrderDepthFirst();
        tree.inOrderDepthFirst();
        tree.postOrderDepthFirst();
        System.out.println(tree.isBST());
        System.out.println(tree.isBSTInOrder());

        //tree.delete(14);
        //tree.breadthFirst();
        //System.out.println(tree.isBST());

        System.out.println(tree.successor(20));

    }
}
