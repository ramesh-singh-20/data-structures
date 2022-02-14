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

    public int popFront(){
        if(head== null){
            throw new ArrayIndexOutOfBoundsException("List is empty.");
        }
        size--;
        int value= head.data;
        if(head==tail){
            head= null;
            tail= null;
        }else{
            head= head.next;
        }

        return value;
    }

    /*
    Introduction of tail has reduced the time complexity
    of pushing elements to the end to O(1)
     */
    public void pushBack(int value){
        size++;
        Node node= new Node();
        node.data= value;
        if(tail== null){
            head=tail= node;
        }else{
            tail.next= node;
            tail= node;
        }
    }

    /*
    Introduction of tail has no effect on time complexity to remove item from the end.
    It is still O(n) as there is no way to get the item previous to tail.
     */
    public int popBack(){
        if(head== null){
            throw new ArrayIndexOutOfBoundsException("List is empty.");
        }
        size--;

        int value= tail.data;
        if(head==tail){
            head=tail= null;
            return value;
        }
        Node current= head;
        Node previous= null;

        while(current.next!= null){
            previous= current;
            current= current.next;
        }
        tail= previous;
        previous.next= null;
        return value;
    }

    public int front(){
        if(head== null){
            throw new ArrayIndexOutOfBoundsException("List is empty.");
        }

        return head.data;
    }

    public int back(){
        if(head== null){
            throw new ArrayIndexOutOfBoundsException("List is empty.");
        }

        return tail.data;
    }

    public void insert(int index, int value){
        if(index<0 || index> size){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        }

        size++;
        Node node= new Node();
        node.data= value;

        if(index==0){
            node.next= head;
            head= node;
            if(tail== null){
                tail= head;
            }
        }else{
            Node current= head;
            Node previous= null;
            for(int i=0; i<index; i++){
                previous= current;
                current= current.next;
            }
            if(previous== tail){
                tail= node;
            }
            previous.next= node;
            node.next= current;
        }

    }

    public int remove(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        int value= head.data;
        size--;
        if(index==0){
            if(head== tail){
                head=tail= null;
            }else{
                head= head.next;
            }
        }else{
            Node current= head;
            Node previous= null;

            for(int i=0; i<index; i++){
                previous= current;
                current= current.next;
            }
            if(current==tail){
                tail= previous;
            }
            previous.next= current.next;
            value= current.data;
            current.next= null;
        }


        return value;
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
