package com.alphacoder;

public class App {
    public static void main(String[] args) {
        DynamicArray array= new DynamicArray();

        /*System.out.println("********Empty Array***************");
        System.out.println(array.size());
        System.out.println(array.capacity());
        System.out.println(array.isEmpty());
        System.out.println(array.pop());*/

        /*System.out.println("********Single element Array***************");
        array.prepend(3);
        array.prepend(4);
        array.prepend(5);
        System.out.println(array.size());
        System.out.println(array.capacity());
        System.out.println(array.isEmpty());
        System.out.println(array);
        //array.pop();
        //array.pop();
        //array.pop();
        System.out.println(array);
        //array.pop();
        System.out.println(array.at(1));*/

        /*array.insert(0, 1);
        array.insert(1, 3);
        array.insert(1, 2);
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.capacity());
        System.out.println(array.isEmpty());*/
/*
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
        System.out.println(array.delete(2));
        System.out.println(array);*/
        //array.push(1);
        //array.push(2);
        array.push(3);
        array.push(5);
        array.push(5);
        array.push(4);
        array.push(4);
        array.push(7);
        array.remove(4);
        array.print();
    }
}
