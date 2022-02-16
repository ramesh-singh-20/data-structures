package com.alphacoder;

public class App {
    public static void main(String[] args) {
        Queue queue= new Queue();

        System.out.println("Is Empty: "+ queue.isEmpty());

        System.out.println("*****Enqueue***********");
        queue.enqueue(9);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.print();

        System.out.println("*****Dequeue***********");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        queue.print();
    }
}
