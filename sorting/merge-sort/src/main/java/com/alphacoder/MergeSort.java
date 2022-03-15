package com.alphacoder;

public class MergeSort {

    private int [] merge(int [] a, int [] b, int[] aux) {
        int index1=0;
        int index2=0;
        int index=0;
        //checking if arrays are already sorted

        if(a[a.length-1]<= b[0]){
            while(index1< a.length){
                aux[index]=a[index1];
                index++;
                index1++;
            }
        }
        while(index1< a.length && index2< b.length){

            if(a[index1]<= b[index2]){
                aux[index]= a[index1];
                index1++;
            }else{
                aux[index]= b[index2];
                index2++;
            }
            index++;
        }

        while(index1< a.length){
            aux[index]= a[index1];
            index1++;
            index++;
        }

        while(index2< b.length){
            aux[index]= b[index2];
            index2++;
            index++;
        }

        return aux;
    }

    public int [] mergeSort(int [] a){
        if(a.length<2){
            return a;
        }
        int left=0;
        int right= a.length-1;
        int mid= (left+ (right-left)/2);

        int [] leftArr= new int[mid+1-left];
        int [] rightArr= new int[right-mid];

        for(int i=0; i<leftArr.length; i++){
            leftArr[i]= a[i];

        }
        int index=mid+1;
        for(int i=0; i< rightArr.length; i++){
            rightArr[i]= a[index];
            index++;
        }
        leftArr= mergeSort(leftArr);
        rightArr= mergeSort(rightArr);
        return merge(leftArr, rightArr, a);
    }
}
