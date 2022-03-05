package com.alphacoder;

public class BinarySearch {

    public int binarySearchIterative(int arr[], int key){
        int left=0;
        int right= arr.length-1;

        while(left<=right){
            int mid= (left+right)/2;

            if(key<arr[mid]){
                right= mid-1;
            }
            else if(key> arr[mid]){
                left= mid+1;
            }
            else if(key==arr[mid]){
                return mid;
            }

        }

        return -1;
    }

    public int binarySearchRecursive(int [] arr, int key, int left, int right){
        if(left>right){
            return -1;
        }
        int mid= (left+right)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(key<arr[mid]){
            return binarySearchRecursive(arr, key, left, mid-1);
        }
        else if(key>arr[mid]){
            return binarySearchRecursive(arr, key, mid+1, right);
        }
        return -1;
    }
}
