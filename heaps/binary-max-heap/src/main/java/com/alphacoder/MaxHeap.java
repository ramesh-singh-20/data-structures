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
}
