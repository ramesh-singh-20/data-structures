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

        System.out.println("*****Push Back********");
        list.pushBack(9);
        //list.print();
        list.pushBack(6);
        list.pushBack(2);
        list.pushBack(5);
        list.print();
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());

        System.out.println("*****Pop Back********");
        System.out.println(list.popBack());
        System.out.println(list.popBack());
        System.out.println(list.popBack());
        System.out.println(list.popBack());
        list.print();
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());


        System.out.println("*****Front Back********");
        list.print();
        list.pushBack(5);
        list.pushBack(  9);
        list.pushFront(4);
        list.pushFront(6);
        list.pushFront(8);
        list.pushFront(2);
        System.out.println("Front: "+list.front());
        System.out.println("Back: "+ list.back());
        list.print();

        System.out.println("*****Insert********");
        list.insert(0, 0);
        list.insert(7, 7);
        list.insert(4, 89);
        list.print();
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());
        list.popBack();
        list.popBack();
        list.popBack();
        list.popBack();
        list.popBack();
        list.popBack();
        list.popBack();
        list.popBack();

        list.insert(0, 7);
        list.print();
        list.popBack();
        list.popBack();
        list.insert(0, 7);
        list.print();
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());

        System.out.println("*****Remove********");
        System.out.println(list.erase(0));
        list.insert(0, 0);
        list.insert(1, 1);
        list.insert(2, 2);
        list.insert(3, 3);
        System.out.println(list.erase(1));
        System.out.println(list.erase(2));
        System.out.println(list.erase(0));
        System.out.println(list.erase(0));
        //System.out.println(list.remove(0));
        list.print();
        System.out.println("is empty: "+list.isEmpty());
        System.out.println("Size: "+ list.size());

        System.out.println("*****value from end********");
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(3);
        list.print();
        System.out.println(list.valueFromEnd(5));

        System.out.println("*****value from end********");
        list.print();
        list.removeValue(7);
        list.print();
        list.removeValue(1);
        list.removeValue(3);
        list.removeValue(3);
        list.removeValue(4);
        list.removeValue(2);
        list.removeValue(5);
        list.removeValue(0);
        list.print();

        System.out.println("*****reverse********");
        list.reverse();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        list.print();
        list.reverse();
        list.print();

    }
}
