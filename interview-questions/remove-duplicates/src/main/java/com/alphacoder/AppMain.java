package com.alphacoder;

import java.util.HashSet;
import java.util.Set;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Running.");
        testDuplicate();
        duplicates(new int [] {3,1,3,5,4,5});
    }

    private static int duplicate(int [] arr){
        Set<Integer> set= new HashSet<>();

        for(int i=0; i< arr.length; i++){
            if(set.contains(arr[i])){
                return arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        return -1;
    }

    public static void duplicates(int [] arr){
        for(int i=0; i< arr.length; i++){
            arr[arr[i]%arr.length]= arr[arr[i]%arr.length]+arr.length;
        }

        System.out.println("The repeating elements are: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]>= 2*arr.length){
                System.out.println(i);
            }
        }
    }

    public static void testDuplicate(){
        int [] arr= {3,1,3,5,8,8};
        if(duplicate(arr)==3){
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed.");
        }
    }


}


