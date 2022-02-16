package com.alphacoder;

public class Queue {
    private Node head;
    private Node tail;


    public boolean isEmpty(){
        return head==null;
    }

    public void enqueue(int value){
        Node node= new Node(value);
        if(head== null){
            tail= node;
            head= node;
            return;
        }
        tail.next= node;
        tail= node;
    }

    public int dequeue(){
        if(head== null){
            throw new RuntimeException("Operation not suppported as queue is empty.");
        }

        int value= head.data;
        head= head.next;

        if(head== null){
            tail= null;
        }

        return value;
    }

    public void print(){
        Node current= head;

        while(current!= null){
            System.out.print(current.data+ " ");
            current= current.next;
        }
        System.out.println();
    }


}
