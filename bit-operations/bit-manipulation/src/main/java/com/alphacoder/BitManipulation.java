package com.alphacoder;

public class BitManipulation {

    public int setBit(int number, int position){
        int mask=1;
        mask= mask << position;
        number= number|mask;

        return number;
    }

    public int clearBit(int number, int position){
        int mask=1;
        mask= mask<< position;
        mask= ~mask;
        number= number & mask;
        return number;
    }

    public int flipBit(int number, int position){
        int mask=1;
        mask= mask << position;
        number= number ^ mask;

        return number;
    }

    public boolean isBitSet(int number, int position){
        int shifted= number >> position;
        return (shifted & 1)==1;
    }

    public int modifyBit(int number, int position, int state){
        int mask= 1;
        mask= mask << position;

        return (number & ~mask) | (-state & mask);
    }

    public boolean isEven(int number){
        int mask=1;
        return ((number & mask)==0);
    }

    public boolean isPowerTwo(int number){
        return ((number & number-1)==0);
    }

    public int countDifferentBits(int num1, int num2){
        int xor= num1 ^ num2;
        int count=0;
        while(xor>0){
            xor= xor & (xor-1);
            count++;
        }
        return count;
    }

    public int min(int num1, int num2){
        int min= num2 ^ ((num1 ^ num2) & ~(num1<< num2));
        return min;
    }

    public int max(int num1, int num2){
        int max= num1 ^ ((num1 ^ num2) & ~(num1<< num2));
        return max;
    }
}
