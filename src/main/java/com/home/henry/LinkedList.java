package com.home.henry;

public class LinkedList {

    private static class Node {
        int value;
        Node next;

        Node() {
            this.next = null;
        }

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private int size = 0;
    private Node head;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addHead(int value) {
        head = new Node(value, head);
        size++;
    }

    public void addTail(int value) {
        Node newNode = new Node(value, null);
        Node curr = head;
        if (head == null) {
            head = newNode;
        }
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }

    public void print() {
        System.out.print("size: " + size);
        System.out.println();
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void insert(int index, int value) {
        Node tmp = head;
        if (index > size) {
            this.addTail(value);
            return;
        }
        int count = 0;
        while (count < index) {
            if (count != index - 1) {
                tmp = tmp.next;
            } else {
                tmp.next = new Node(value, tmp.next);
                size++;
            }
            count++;
        }
    }

    public void removeTail() {
        if (!isEmpty()) {
            Node tmp = head;
            if (tmp.next != null) {
                while (tmp.next.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                size--;
            } else {
                head = null;
                size--;
            }
        }
    }

    public void removeHead() {
        if (size > 0) {
            head = head.next;
            size--;
        }
    }

    public void sortedInsert(int value) {
        Node newNode = new Node(value, null);
        Node curr = head;
        if (curr == null || curr.value > value) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        while (curr.next != null && curr.next.value < value) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public static void main(String[] args) {
        LinkedList n = new LinkedList();
        n.sortedInsert(5);
        n.sortedInsert(5);
        n.print();
    }

    public boolean isPresent(int value) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.value == value) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public boolean deleteNode(int value) {
        Node tmp = head;
        if (isEmpty()) {
            return false;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return true;
        }
        while (tmp.next != null) {
            if (tmp.next.value == value) {
                tmp.next = tmp.next.next;
                size--;
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        head = prev;
    }

}
