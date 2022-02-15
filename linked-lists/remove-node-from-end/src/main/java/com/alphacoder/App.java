package com.alphacoder;

public class App {
    public static void main(String[] args) {
        ListNode node1= new ListNode(1);
        ListNode head= node1;

        ListNode node2= new ListNode(2);
        node1.next= node2;

        ListNode node3= new ListNode(3);
        node2.next= node3;

        ListNode node4= new ListNode(4);
        node3.next= node4;

        print(head);

        print(remove(head, 1));
        print(remove(head, 2));
        //print(remove(head, 3));

    }

    public static ListNode remove(ListNode head, int node){
         ListNode dummyNode=new ListNode(0);
         dummyNode.next= head;
         ListNode fast= dummyNode;
         ListNode slow= dummyNode;

         for(int i=0; i<node; i++){
             fast= fast.next;
         }

         while(fast.next!= null){
             fast= fast.next;
             slow= slow.next;
         }
         slow.next= slow.next.next;
         return dummyNode.next;
    }

    public static void print(ListNode head){
        ListNode current= head;
        while(current!= null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
        System.out.println();
    }
}
