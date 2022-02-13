package com.alphacoder;

public class LinkedList {
    private Node head;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int valueAt(int index){
        if(index<0 || index>= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node currentNode= head;
        for(int i=0; i<index; i++){
            currentNode= head.getNext();
        }

        return currentNode.getData();
    }

    public void pushFront(int value){
        size++;
        Node node= new Node(value);
        if(head==null){
            head= node;
            return;
        }

        node.setNext(head);
        head= node;
    }

    public int popFront(){
        if(head== null){
            throw new ArrayIndexOutOfBoundsException("List is empty.");
        }
        size--;
        int value= head.getData();
        head= head.getNext();

        return value;
    }

    public void pushBack(int value){
        size++;
        Node node= new Node(value);
        if(head==null){
            head= node;
            return;
        }
        Node currentNode= head;
        while(currentNode.getNext()!= null){
            currentNode= currentNode.getNext();
        }
        currentNode.setNext(node);
    }

    public int popBack(){
        if(head== null){
            throw new ArrayIndexOutOfBoundsException("List is empty.");
        }
        size--;

        Node previousNode= null;
        Node currentNode= head;

        while(currentNode.getNext()!= null){
            previousNode=currentNode;
            currentNode= currentNode.getNext();
        }
        int value= currentNode.getData();

        if(currentNode== head){
            head= null;
            return value;
        }
        previousNode.setNext(null);

        return value;
    }

    public void print(){
        Node currentNode= head;

        while(currentNode!= null){
            System.out.print(currentNode.getData()+" ");
            currentNode= currentNode.getNext();
        }
        System.out.println();
    }
}
