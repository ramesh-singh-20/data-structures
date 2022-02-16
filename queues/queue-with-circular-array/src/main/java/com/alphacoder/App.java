package com.alphacoder;

public class App {
    public static void main(String[] args) {
        Queue queue= new Queue();

        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());

        System.out.println("*****Enqueue***********");
        queue.enqueue(9);
        queue.enqueue(8);
        queue.enqueue(6);

        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());

        System.out.println(queue.dequeue());
        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());

        System.out.println(queue.dequeue());
        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());

        System.out.println(queue.dequeue());
        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());

        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(5);
        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println("Is Full: "+ queue.isFull());


    }
}
