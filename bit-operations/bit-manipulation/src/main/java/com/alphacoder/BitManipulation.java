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
}
