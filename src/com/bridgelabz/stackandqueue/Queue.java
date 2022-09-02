package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedList.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        queue.appending(56);
        queue.appending(30);
        queue.appending(70);
        queue.showLinkedList();
        queue.firstElementDelete();
    }
}
