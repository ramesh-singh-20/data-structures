package com.alphacoder;

public class BinarySearchTree {
    public Node root;

    public void insert(int data){
        root= insert(data, this.root);
    }

    private Node insert(int data,Node root){
        if(root==null){
            Node node= new Node(data);
            root= node;
        }

        if(data<= root.data){
            root.left= insert(data, root.left);
        }
        else{
            root.right= insert(data, root.right);
        }
        return root;
    }
}
