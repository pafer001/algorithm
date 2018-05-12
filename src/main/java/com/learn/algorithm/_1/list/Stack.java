package com.learn.algorithm._1.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stack<Item> implements Iterable<Item> {

    private Node first;
    private int N;

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldFirst = this.first;

        first = new Node();
        first.item = item;

        first.next = oldFirst;
        N++;
    }

    public Item pop() {

        first = first.next;
        Item item = first.item;
        N--;
        return item;
    }

    private class Node {
        Item item;
        Node next;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }


    private class StackIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
