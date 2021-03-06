package com.alphacoder;

import java.util.LinkedList;
import java.util.Queue;

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

    public void breadthFirst(){
        breadthFirst(root);
        System.out.println();
    }

    private void breadthFirst(Node root){
        Queue<Node> queue= new LinkedList<>();;
        if(root!= null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            Node current= queue.poll();
            System.out.print(current.data+ " ");
            if(current.left!= null){
                queue.add(current.left);
            }
            if(current.right!= null){
                queue.add(current.right);
            }
        }
    }

    public void preOrderDepthFirst(){
        preOrderDepthFirst(root);
        System.out.println();
    }

    public void postOrderDepthFirst(){
        postOrderDepthFirst(root);
        System.out.println();
    }

    public void inOrderDepthFirst(){
        inOrderDepthFirst(root);
        System.out.println();
    }

    private void preOrderDepthFirst(Node root){
        if(root== null){
            return;
        }

        System.out.print(root.data+ " ");
        preOrderDepthFirst(root.left);
        preOrderDepthFirst(root.right);
    }

    private void inOrderDepthFirst(Node root){
        if(root== null){
            return;
        }

        inOrderDepthFirst(root.left);
        System.out.print(root.data+ " ");
        inOrderDepthFirst(root.right);
    }

    private void postOrderDepthFirst(Node root){
        if(root== null){
            return;
        }
        postOrderDepthFirst(root.left);
        postOrderDepthFirst(root.right);
        System.out.print(root.data+ " ");
    }

    public boolean isBST(){
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBST(Node root, long min , long max){
        if(root== null){
            return true;
        }

        if(root.data>min && root.data < max &&
            isBST(root.left, min, root.data+1) &&
            isBST(root.right, root.data, max)){
            return true;
        }
        return false;
    }

    public boolean isBSTInOrder(){
        return isBST(root, Integer.MIN_VALUE);
    }


    private boolean isBST(Node root, int previous){
        if(root== null){
            return true;
        }
        if(!isBST(root.left, previous)){
            return false;
        }
        if(root.data<= previous){
            return false;
        }
        previous= root.data;
        return isBST(root.right, previous);
    }

    public void delete(int data){
        delete(root, data);
    }

    private Node delete(Node root, int data){
        if(root== null){
            return null;
        }

        if(data< root.data){
            root.left= delete(root.left, data);
        }
        else if(data> root.data){
            root.right= delete(root.right, data);
        }
        else if(data== root.data){
            //CASE1: 0 sub child
            if(root.left== null && root.right== null){
                root= null;
            }
            //case2: 1 sub child
            else if(root.left==null){
                root= root.right;
            }
            else if(root.right== null){
                root= root.left;
            }
            else {
                //case3: 2 sub children
                root.data = min(root.right);
                root.right = delete(root.right, root.data);
            }
        }

        return root;
    }

    private int min(Node root){

        int min= root.data;
        Node current= root;
        while(current.left!= null){
            if(current.left.data<min){
                min= current.left.data;
            }
            current= current.left;
        }

        return min;

    }

    private Node successor(Node root, int data){
        if(root== null){
            return null;
        }
        Node current= find(root, data);

        if(current!= null){
            if(current.right!= null){
                return findMinNode(current.right);
            }else{
                Node ancestor= root;
                Node successor= null;
                while(current!= ancestor){
                    if(current.data<ancestor.data){
                        successor= ancestor;
                        ancestor= ancestor.left;
                    }else{
                        ancestor= ancestor.right;
                    }
                }
                return successor;
            }
        }

        return current;
    }

    public int successor(int data){
        Node successor= successor(root, data);

        if(successor== null){
            return -1;
        }else{
            return successor.data;
        }
    }

    private Node find(Node root, int data){
        if(root== null){
            return null;
        }
        Node current= root;
        while(current!= null){
            if(data<current.data){
                current= current.left;
            }
            else if(data> current.data){
                current= current.right;
            }
            else if(data== current.data){
                break;
            }
        }
        return current;
    }

    private Node findMinNode(Node root){
        if(root== null){
            return null;
        }
        Node current= root;

        while(current.left!= null){
            current= current.left;
        }
        return current;
    }



}
