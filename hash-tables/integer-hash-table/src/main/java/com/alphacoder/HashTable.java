package com.alphacoder;

import java.util.concurrent.ThreadLocalRandom;

public class HashTable {
    private int maxSize;
    private int currentSize;
    private double loadFactor;
    private int prime;
    private int a;
    private int b;

    public HashTable(){
        this.maxSize= 8;
        this.prime= nextPrime(maxSize);
        int a = ThreadLocalRandom.current().nextInt(1, prime + 1);
        int b= ThreadLocalRandom.current().nextInt(1, prime+1);
    }

    private int hash(int key){
        return (((a*key)+b)%prime)%maxSize;
    }

    public void insert(int key, int value){
        loadFactor= (double) currentSize/maxSize;
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
}
