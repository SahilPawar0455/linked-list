package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedList.LinkedList;

public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Welcome to the stack and Queue");
        LinkedList stack = new LinkedList();
        stack.addElement(70);
        stack.addElement(30);
        stack.addElement(56);
        stack.showLinkedList();
        stack.firstElementDelete();
        stack.showLinkedList();
    }
}
