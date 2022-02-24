package com.alphacoder;

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
}
