package com.alphacoder;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    private List<Integer> arr;
    private int size;

    public MaxHeap(){
        arr= new ArrayList<>();
        arr.add(0, Integer.MAX_VALUE);
    }

    public void insert(int data){
        size++;
        arr.add(size, data);
        shiftUp(data, size);
    }


    private void shiftUp(int data, int index){
        if(index<=1){
            return;
        }
        int parentIndex= (index/2);

        //swapping child with parent
        if(data> arr.get(parentIndex)){
            int temp= arr.get(parentIndex);
            arr.set(parentIndex, data);
            arr.set(index, temp);
        }
        shiftUp(data, parentIndex);
    }

    public int getMax(){
        if(size<1){
            throw new RuntimeException("Heap is empty.");
        }
        return arr.get(1);
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int extractMax(){
        if(size==0){
            throw new RuntimeException("Heap is empty.");
        }
        int data= arr.get(1);

        arr.set(1, arr.get(size));
        size--;
        shiftDown(1);

        return data;
    }

    private void shiftDown(int index){
        if(index>=size){
            return;
        }

        int maxChildIndex= maxChildIndex(index);
        if(arr.get(index)< arr.get(maxChildIndex)) {
            int temp = arr.get(maxChildIndex);
            arr.set(maxChildIndex, arr.get(index));
            arr.set(index, temp);
            shiftDown(maxChildIndex);
        }

    }

    public int maxChildIndex(int index){

        int leftIndex= 2*index;
        int rightIndex= (2*index)+1;

        if(rightIndex>size){
            return leftIndex;
        }

        if(arr.get(leftIndex)>= arr.get(rightIndex)){
            return leftIndex;
        }

        if(arr.get(leftIndex)< arr.get(rightIndex)){
            return rightIndex;
        }
        return leftIndex;
    }
}
