package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(70);
        linkedList.addElement(30);
        linkedList.addElement(56);
        linkedList.showLinkedList();
        LinkedList linkedList1 = new LinkedList();
        linkedList1.appending(70);
        linkedList1.appending(30);
        linkedList1.appending(56);
        linkedList1.showLinkedList();
    }
}
