package com.alphacoder;

public class BinarySearchTree {
    public Node root;

    public void insert(int data){
        root= insert(data, this.root);
    }

    private Node insert(int data,Node root){
        if(root==null){
            Node node= new Node(data);
            return node;
        }

        if(data<= root.data){
            root.left=insert(data, root.left);
        }
        else{
            root.right=insert(data, root.right);
        }
        return root;
    }

    public boolean search(int data){
        return search(data, root);
    }

    private boolean search(int data, Node root){
        if(root== null){
            return false;
        }
        if(root.data== data){
            return true;
        }
        if(data< root.data){
            return search(data, root.left);
        }else{
            return search(data, root.right);
        }
    }

    public void min(){
        System.out.println(minIterative(root));
        System.out.println(minRecursive(root));
    }

    private int minIterative(Node head){
        if(head== null){
            throw new RuntimeException("Tree is empty.");
        }
        Node current= head;
        while(current.left!= null){
            current= current.left;
        }
        return current.data;
    }

    private int minRecursive(Node head){
        if(head== null){
            throw new RuntimeException("Tree is empty");
        }
        if(head.left==null){
            return head.data;
        }
        return minRecursive(head.left);

    }

    private int maxIterative()



}
