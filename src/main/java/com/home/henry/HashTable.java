package com.home.henry;

public class HashTable {

    private int size;
    private Node[] entries;

    private static class Node<K, V> {
        K k;
        V v;
        Node next;

        Node(K k, V v) {
            this.k = k;
            this.v = v;
            this.next = null;
        }
    }

    public HashTable(int size) {
        this.size = size;
        entries = new Node[size];
        for (int i = 0; i < entries.length; i++) {
            entries[i] = null;
        }
    }

    public HashTable() {
        this(1 << 3);
    }

    private int hash(Object obj) {
        return obj == null ? 0 : (obj.hashCode() % size);
    }

    public <K, V> void set(K k, V v) {
        Node<K, V> node = new Node<>(k, v);
        node.next = entries[hash(k)];
        entries[hash(k)] = node;
    }

    public <K> Object get(K k) {
        Node entry = entries[hash(k)];
        if (entry == null) {
            return null;
        } else {
            while (entry != null) {
                if (entry.k.equals(k)) {
                    return entry.v;
                }
                entry = entry.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        HashTable h = new HashTable();
        for (int i = 0; i < 1000; i++) {
            h.set(i, Math.sqrt(i));
        }
        System.out.println(h.get(484).toString());
    }

}
