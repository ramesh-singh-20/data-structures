package com.alphacoder;

public class App {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println("*****Push Front********");
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.print();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.valueAt(0));
        System.out.println(list.valueAt(1));
    }
}
