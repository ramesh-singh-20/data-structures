package com.alphacoder;

public class App {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        //System.out.println(list.popFront());
        list.pushFront(3);
        list.pushFront(5);
        System.out.println(list.valueAt(0));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.popFront());
        System.out.println(list.valueAt(0));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.popFront());
        //System.out.println(list.valueAt(0));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println("***************Push Back******************");
        list.pushBack(9);
        list.pushBack(5);
        list.pushBack(6);
        list.pushBack(8);
        list.print();
        System.out.println();

        System.out.println("***************Pop Back******************");
        list.popBack();
        list.popBack();
        list.popBack();
        list.print();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.popBack();
        list.print();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        //System.out.println(list.valueAt(0));

    }
}
