package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
        BitManipulation bitManipulation= new BitManipulation();
        int num= 6;
        System.out.println(bitManipulation.setBit(6, 5));

        System.out.println(bitManipulation.clearBit(6, 2));

        System.out.println(bitManipulation.flipBit(6, 0));

        System.out.println(bitManipulation.isBitSet(6, 3));

        System.out.println(bitManipulation.modifyBit(6, 5, 1));

        System.out.println(bitManipulation.modifyBit(6, 2, 0));

        System.out.println(bitManipulation.isEven(23));

        System.out.println(bitManipulation.isEven(32));

        System.out.println(bitManipulation.isPowerTwo(34));

        System.out.println(bitManipulation.isPowerTwo(78));

    }
}
