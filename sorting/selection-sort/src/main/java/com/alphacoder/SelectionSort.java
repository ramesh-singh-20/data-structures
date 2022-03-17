package com.alphacoder;

public class SelectionSort {

    public int[] selectionSort(int[] arr){

        for(int i=0; i< arr.length-1; i++){
            int min= arr[i];
            int minIndex=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]< min){
                    min= arr[j];
                    minIndex= j;
                }
            }
            int temp= arr[i];
            arr[i]= min;
            arr[minIndex]= temp;
        }

        return arr;
    }
}
