package com.learn.algorithm._1.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Queue<Item> implements Iterable<Item> {


    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public Item dequeue() {
        if (isEmpty()) {
            return null;
        }
        Item item = first.item;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return item;
    }

    public void enqueue(Item item) {

        Node lastNode = this.last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            lastNode.next = last;
        }
        N++;
    }
    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    public class Node {

       Item item;
        Node next;
    }

}
