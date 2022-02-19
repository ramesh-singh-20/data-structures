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

    public void max(){
        System.out.println(maxIterative(root));
        System.out.println(maxRecursive(root));
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

    private int maxIterative(Node root){
        if(root== null){
            throw new RuntimeException("Tree is empty.");
        }

        Node current= root;
        while(current.right!= null){
            current= current.right;
        }

        return current.data;
    }

    private int maxRecursive(Node root){
        if(root== null){
            throw new RuntimeException("Tree is empty.");
        }

        if(root.right== null){
            return root.data;
        }

        return maxRecursive(root.right);
    }

    public void height(){
        System.out.println(height(root));
    }

    private int height(Node root){
        if(root==null){
            return -1;
        }

        int left= height(root.left);
        int right= height(root.right);

        return Math.max(left, right)+1;
    }



}
