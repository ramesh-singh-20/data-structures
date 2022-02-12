package com.alphacoder;

public class App {
    public static void main(String[] args) {
        DynamicArray array= new DynamicArray();

        /*System.out.println("********Empty Array***************");
        System.out.println(array.size());
        System.out.println(array.capacity());
        System.out.println(array.isEmpty());
        System.out.println(array.pop());*/

        System.out.println("********Single element Array***************");
        array.push(3);
        array.push(4);
        array.push(5);
        System.out.println(array.size());
        System.out.println(array.capacity());
        System.out.println(array.isEmpty());
        System.out.println(array);
        array.pop();
        array.pop();
        //array.pop();
        System.out.println(array);
        //array.pop();
        System.out.println(array.at(1));
    }
}
