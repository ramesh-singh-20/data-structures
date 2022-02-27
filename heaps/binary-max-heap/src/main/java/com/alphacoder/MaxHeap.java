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

    public int [] heapSort(int [] arr){
        if(arr.length<2){
            return arr;
        }
        arr= heapify(arr);
        int n= arr.length;

        while(n>0) {
            int temp= arr[n-1];
            arr[n - 1] = arr[0];
            arr[0]= temp;

            pushDown(arr, 0, n - 1);
            n--;
        }


        return arr;

    }

    private int[] heapify(int [] arr){
        int n= arr.length;
        for(int i= n/2-1; i>=0; i--){
            int left= 2*i+1;
            int right= 2*i+2;

            if(right>=n || arr[left]>= arr[right]){
                if(arr[i]<arr[left]){
                    int temp= arr[left];
                    arr[left]= arr[i];
                    arr[i]= temp;
                }
            }else{
                if(arr[i]< arr[right]){
                    int temp= arr[right];
                    arr[right]= arr[i];
                    arr[i]= temp;
                }
            }
        }


        return arr;
    }

    private int [] pushDown(int arr[], int index,int size){
            int n= size;
            int left=2*index+1;
            int right= 2*index+2;
            if(left>=n){
                return arr;
            }
            if(right>=n || arr[left]> arr[right]){
                if(arr[index]< arr[left]){
                    int temp= arr[left];
                    arr[left]= arr[index];
                    arr[index]= temp;
                    arr= pushDown(arr, left, size);
                }
            }else{
                if(arr[index]<arr[right]){
                    int temp= arr[right];
                    arr[right]= arr[index];
                    arr[index]= temp;
                    arr= pushDown(arr, right, size);
                }
            }
        return arr;
    }





}
