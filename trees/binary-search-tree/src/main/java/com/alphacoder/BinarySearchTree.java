package com.alphacoder;

public class BinarySearchTree {
    private TreeNode root;


    public boolean isEmpty(){
        return root== null;
    }

    public void insert(int data){
        root=insert(root, data);
    }

    private TreeNode insert(TreeNode root, int data){
        if(root== null){
            TreeNode node= new TreeNode(data);
            return node;
        }

        if(data<= root.data){
            root.left=insert(root.left, data);
        }
        else if(data> root.data){
            root.right=insert(root.right, data);
        }
        return root;
    }
}
