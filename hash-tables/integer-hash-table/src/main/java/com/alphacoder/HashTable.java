package com.alphacoder;

import java.util.concurrent.ThreadLocalRandom;

public class HashTable {
    private int maxSize;
    private int currentSize;
    private int prime;
    private int a;
    private int b;
    private Entry[] entryArr;

    public HashTable(){
        this.maxSize= 8;
        entryArr= new Entry[maxSize];
        this.prime= nextPrime(maxSize);
        a = ThreadLocalRandom.current().nextInt(1, prime + 1);
        b= ThreadLocalRandom.current().nextInt(1, prime+1);
    }

    private int hash(int key){
        return (((a*key)+b)%prime)%maxSize;
    }

    public void insert(int key, String value){

        int temp= hash(key);
        int i= temp;

        do {
            if (entryArr[i] == null) {
                Entry entry = new Entry();
                entry.value = value;
                entryArr[i] = entry;
                currentSize++;
                reSize();
                return;
            } else if (entryArr[i].isDeleted) {
                entryArr[i].value = value;
                entryArr[i].isDeleted = false;
                currentSize++;
                reSize();
                return;
            } else if (entryArr[i].value.equals(value)) {
                entryArr[i].value = value;
                return;
            } else if (!entryArr[i].value.equals(value)) {
                i = (i + 1) % maxSize;
            }
        }while(i!= temp);
    }

    private void reSize(){
        if((double)currentSize/(double) maxSize>0.5){
            maxSize= 2* maxSize;
            prime= nextPrime(maxSize);
            a= ThreadLocalRandom.current().nextInt(1, prime + 1);
            b= ThreadLocalRandom.current().nextInt(1, prime+1);
            Entry [] tempArr= new Entry[maxSize];

            for(int i=0; i<entryArr.length; i++){
                if(entryArr[i]!= null && !entryArr[i].isDeleted){
                    int temp= hash(entryArr[i].key);
                     int j= temp;

                     do {
                         if(tempArr[j]==null){
                             tempArr[j]= entryArr[i];
                             break;
                         }
                         j=(j+1)%maxSize;

                    }while(temp!= j);
                }
            }
            entryArr= tempArr;
            tempArr= null;

        }
    }

    public boolean exists(int key){
        int i= hash(key);
        int temp= i;

        do{
            if(entryArr[i]== null){
                return false;
            }
            if(entryArr[i]!= null){
                return true;
            }

            if(entryArr[i].isDeleted){
                i=i+1;
            }
        }while(i!= temp);

        return false;
    }


    private int nextPrime(int num){
        if(num<=1){
            return 2;
        }
        int prime= num;
        boolean found= false;

        while(!found){
            num++;
            if(isPrime(num)){
                found= true;
            }

        }
        return num;
    }

    private boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num<=3){
            return true;
        }

        if(num%2==0 || num%3==0){
            return false;
        }

        for(int i=5; i*i<num; i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    public void print(){
        for(int i=0; i<maxSize; i++){
            if(entryArr[i]!= null && !entryArr[i].isDeleted){
                System.out.print(entryArr[i]+ " ");
            }
        }
        System.out.println();
    }

    public int getMaxSize(){
        return maxSize;
    }
}
