package com.alphacoder;

public class AppMain {
    public static void main(String[] args) {
       HashTable table= new HashTable();
       System.out.println(table.exists(0));
       table.insert(1, "Ramesh");
       table.print();
       System.out.println(table.exists(1));
       System.out.println(table.exists(2));
       table.insert(2, "Bhawana");
       table.insert(3, "Meshu");
       System.out.println(table.exists(2));
       System.out.println(table.exists(3));
       table.print();
    }
}
