package com.alphacoder;


import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            resize(capacity*2, size-1);
        }
        arr[size-1]= value;
    }

    public void prepend(int value){
        size+=1;
        System.out.println("New Size: "+size);
        if(size>capacity){
            resize(capacity*2, size-1);
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
            return;
        }
        if(index==size){
            push(value);
            return;
        }

        size+=1;
        if(size>capacity){
            resize(capacity*2, size-1);
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
            resize(capacity/2, size+1);
        }
        return value;
    }

    public int delete(int index){
        if(index<0 ||index>= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        int value= arr[index];
        if(index==size-1){
            pop();
        }else{
            for(int i=index; i< size; i++){
                arr[i]= arr[i+1];
            }
            size-=1;
        }

        return value;
    }

    public void remove(int value){
        List<Integer> indexes= new ArrayList<>();
        for(int i=0; i< size; i++){
            if(arr[i]== value){
                indexes.add(i);
            }
        }
        for(int i=0; i< indexes.size(); i++){
            delete(indexes.get(i)-i);
        }

    }

    public int find(int value){
        for(int i=0; i< size; i++){
            if(arr[i]== value){
                return i;
            }
        }
        return -1;
    }


    private void resize(int capacity, int size){
        this.capacity= capacity;
        System.out.println("New capacity: "+this.capacity);
        int [] tempArr= new int[capacity];

        for(int i= 0; i<size-1; i++){
            tempArr[i]= arr[i];
        }

        this.arr= tempArr;
    }

    public void print() {
        System.out.print("[");
        for(int i=0; i<size; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print("]");
    }
}
