package com.alphacoder;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head== null;
    }

    public int valueAt(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node current= head;
        for(int i=0; i<index; i++){
            current= current.next;
        }

        return current.data;
    }

    public void pushFront(int value){
        size++;
        Node node= new Node();
        node.data= value;
        if(head== null){
            head=tail=node;
        }else{
            node.next= head;
            head= node;
        }
    }

    public void print(){
        Node current= head;

        while(current!= null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
        System.out.println();
    }


}
