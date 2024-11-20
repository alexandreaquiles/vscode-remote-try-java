package com.mycompany.app;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;
        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private int size = 0;
    private Node head = null;

    public int size() {
        return size;
    }

    public void add(int element) {
       Node newNode = new Node(element, null);
       if (head == null) {
        head = newNode;
       } else {
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
       }
       size++;
    }

    public int get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException(i);
        }
        Node node = head;
        for (int c = 0; c < i; c++) {
            node = node.next;
        }
        return node.value;
    }

}
