package com.alphacoder;

public class BinarySearchTree {
    public Node root;

    public void insert(int data,Node root){
        if(this.root==null){
            Node node= new Node(15);
            this.root= node;
        }

        if(data<= root.data){
            insert(data, root.left);
        }
        else{
            insert(data, root.right);
        }

    }
}
