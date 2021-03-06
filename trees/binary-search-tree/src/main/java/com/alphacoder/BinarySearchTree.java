package com.alphacoder;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void bfs(){
        breadthFirstTraversal(root);
        System.out.println();
    }

    private void breadthFirstTraversal(TreeNode root){
        if(root== null){
            return;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current= queue.poll();
            if(current.left!= null){
                queue.add(current.left);
            }
            if(current.right!= null){
                queue.add(current.right);
            }
            System.out.print(current.data+" ");
        }
    }
    private int countNodes(TreeNode root, int count){
        if(root== null){
            return count;
        }

        count++;
        count=countNodes(root.left,count);
        count=countNodes(root.right,count);

        return count;
    }

    public void countNodes(){
        System.out.println("Count: "+countNodes(root, 0));
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode root){
        if(root== null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+ " ");
        inOrderTraversal(root.right);
    }

    public void search(int data){
        System.out.println(search(root, data));
    }

    private boolean search(TreeNode root, int data){
        if(root== null){
            return false;
        }

        if(data< root.data){
            return search(root.left, data);
        }
        if(data> root.data){
            return search(root.right, data);
        }
        if(data== root.data){
            return true;
        }
        else{
            return false;
        }
    }

    public void height(){
        System.out.println(height(root));
    }

    private int height(TreeNode root){
        if(root== null){
            return -1;
        }
        return 1+Math.max(height(root.right), height(root.left));
    }

    public void min(){
        System.out.println("Minimum.");
        System.out.println(min(root));
        System.out.println(minRecursive(root));
    }

    public void max(){
        System.out.println("Maximum.");
        System.out.println(max(root));
        System.out.println(maxRecursive(root));
    }

    private int min(TreeNode root){
        if(root== null){
            throw new RuntimeException("Tree is empty.");
        }else{
            TreeNode current= root;
            while(current.left!= null){
                current= current.left;
            }
            return current.data;
        }
    }

    private int minRecursive(TreeNode root){
        if(root== null){
            throw new RuntimeException("Tree is empty.");
        }
        if(root.left== null){
            return root.data;
        }
        return minRecursive(root.left);
    }

    private int maxRecursive(TreeNode root){
        if(root== null){
            throw new RuntimeException("Tree is empty.");
        }
        if(root.right== null){
            return root.data;
        }
        return minRecursive(root.right);
    }

    private int max(TreeNode root){
        if(root== null){
            throw new RuntimeException("Tree is empty.");
        }else{
            TreeNode current= root;
            while(current.right!= null){
                current= current.right;
            }
            return current.data;
        }
    }
    public void isBST(){
        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    private boolean isBST(TreeNode root, int min, int max){
        if(root==null){
            return true;
        }
        if(min<root.data && root.data<max){
            return (isBST(root.left, min, root.data+1)&& isBST(root.right, root.data, max));
        }else{
            return false;
        }

    }

    public void delete(int data){
        delete(root, data);
    }

    private TreeNode delete(TreeNode root, int data){
        if(root== null){
            return root;
        }

        if(data< root.data){
            root.left=delete(root.left, data);
        }
        else if(data> root.data){
            root.right=delete(root.right, data);
        }
        else if(data== root.data){
            //Case1: No children
            if(root.left==null && root.right== null){
                root= null;
            }

            //Case2: 1 sub child
            else if(root.right== null){
                root= root.left;
            }
            else if(root.left== null){
                root= root.right;
            }

            //Case 3: 2 sub child
            else if(root.right!= null && root.left!= null){
                int min= min(root.right);
                root.data= min;
                root.right=delete(root.right, min);
            }

        }

        return root;
    }

    public void inOrderSuccessor(int data){

        System.out.println("InOrderSuccessor: "+inOrderSuccessor(root, data).data);
    }
    
    private  TreeNode inOrderSuccessor(TreeNode root, int data){
        if(root== null){
            return root;
        }

        TreeNode current= find(root, data);
        if(current== null){
            return null;
        }
        System.out.println("Current:" +current.data);
        //Case1: right subtree
        if(current.right!= null) {
            return findMinNode(root.right);
        }
        //Case2: no right subtree
        else if(current.right== null) {
            TreeNode ancestor = root;
            TreeNode successor= null;

            while(current!= ancestor){
                if(current.data< ancestor.data){
                    successor= ancestor;
                    ancestor= ancestor.left;

                }else{
                    ancestor= ancestor.right;
                }
            }
            return successor;
        }
        return current;
    }

    private TreeNode findMinNode(TreeNode root){
        if(root== null){
            return root;
        }

        TreeNode current= root;
        while(current.left!= null){
            current= current.left;
        }

        return root;
    }

    private TreeNode find(TreeNode root, int data){
        if(root== null){
            return root;
        }
        TreeNode current= root;
        if(data< current.data){
            return find(root.left, data);
        }
        else if(data> current.data){
            return findMinNode(root.right);
        }
        else{
            return root;
        }
    }




}
