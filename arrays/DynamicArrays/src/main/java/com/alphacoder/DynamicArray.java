package com.alphacoder;


import java.util.Arrays;

public class DynamicArray {
    private int capacity;
    private int size;
    private int [] arr;

    public DynamicArray(){
        this.capacity= 16;
        this.arr= new int[this.capacity];
    }

    public int size(){
        return this.size;
    }

    public int capacity(){
        return this.capacity;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public int at(int index){
        if(index < 0 || index>= size){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        }
        return this.arr[index];
    }

    public void push(int value){
        this.size+=1;
        System.out.println("New Size: "+ this.size);
        if(size>capacity){
            resize(capacity*2);
        }
        arr[size-1]= value;
    }

    public void prepend(int value){
        size=+1;
        System.out.println("New Size: "+size);
        if(size>capacity){
            resize(capacity*2);
        }
        for (int i=size-1; i> 0; i--){
            arr[i]= arr[i-1];
        }
        arr[0]= value;
    }

    public void insert(int index, int value){

        if(index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index==0){
            prepend(value);
        }
        if(index==size){
            push(value);
        }
        if(size>capacity){
            resize(capacity*2);
        }
        for (int i=size-1; i> index; i--){
            arr[i]= arr[i-1];
        }
        arr[index]= value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop from an empty array.");
            throw new ArrayIndexOutOfBoundsException();
        }
        int value= arr[size-1];
        size-=1;
        System.out.println("New Size: "+ this.size);
        if(size==capacity/4){
            resize(capacity/4);
        }
        return value;
    }

    public void delete(int index){

    }

    public void remove(int value){

    }

    public int find(int value){
        return -1;
    }


    private void resize(int capacity){
        this.capacity= capacity;
        System.out.println("New capacity: "+this.capacity);
        int [] tempArr= new int[capacity];

        for(int i= 0; i<size; i++){
            tempArr[i]= arr[i];
        }

        this.arr= tempArr;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
