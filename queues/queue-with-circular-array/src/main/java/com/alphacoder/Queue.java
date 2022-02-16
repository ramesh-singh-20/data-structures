package com.alphacoder;

public class Queue {
    private int [] arr;
    private int read;
    private int write;

    public Queue(){
        arr= new int[5];
    }

    public boolean isEmpty(){
        return(read==write);
    }

    public void enqueue(int value){
        int index= (write+1)%arr.length;
        if(index==read){
            throw new RuntimeException("Operation not supported as queue is full.");
        }
        arr[write]= value;
        write= index;
    }

    public boolean isFull(){
        if(((write+1)%arr.length)==read){
            return true;
        }

        return false;
    }

    public int dequeue(){
        if(read==write){
            throw new RuntimeException("Operation not supported as queue is empty.");
        }

        int value= arr[read];
        read= (read+1)%arr.length;
        return value;
    }



}
