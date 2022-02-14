package com.alphacoder;

public class App {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();

        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());

        System.out.println("*****Push Front********");
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.print();
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());
        System.out.println(list.valueAt(0));
        System.out.println(list.valueAt(1));

        System.out.println("*****Pop Front********");
        System.out.println(list.popFront());
        list.print();
        System.out.println(list.popFront());
        System.out.println(list.popFront());
        list.print();
        System.out.println(list.valueAt(0));
        System.out.println(list.popFront());
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());
        //System.out.println(list.popFront());

    }
}
