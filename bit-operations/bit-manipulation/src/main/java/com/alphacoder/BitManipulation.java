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
}
