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

        System.out.println("***************Front******************");
        list.pushBack(8);
        list.pushBack(0);
        list.pushFront(5);
        System.out.println(list.front());
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println("***************Back******************");
        list.print();
        System.out.println(list.back());
        list.popFront();
        list.print();
        System.out.println(list.back());
        list.popFront();
        list.print();
        System.out.println(list.back());
        list.popFront();
        list.print();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        //System.out.println(list.back());

        System.out.println("***************Insert*****************");
        list.insert(0, 0);
        list.insert(0, 1);
        list.insert(0, 2);
        list.insert(1, 2);
        list.print();

        System.out.println("***************Erase*****************");
        System.out.println(list.erase(0));
        System.out.println(list.erase(1));
        System.out.println(list.erase(1));
        System.out.println(list.erase(0));
        //System.out.println(list.erase(0));
        list.print();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("***************Value*****************");

        list.pushFront(9);
        list.pushFront(5);
        list.pushFront(6);
        list.pushFront(3);
        list.print();
        //System.out.println(list.valueAt(3));
        System.out.println(list.valueFromEnd(3));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("**********Reversing*****************");
        list.print();
        //list.popFront();
        //list.popFront();
        //list.popFront();
        //list.popFront();
        list.reverse();
        list.print();

        System.out.println("**********Remove Value*****************");
        list.removeValue(9);
        list.print();
        list.removeValue(6);
        list.print();
        list.removeValue(3);
        list.print();
        list.removeValue(5);
        list.print();
        System.out.println(list.isEmpty());
        list.removeValue(5);
    }
}
