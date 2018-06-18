package com.learn.algorithm._2;

import org.junit.Test;

public class MaxPQTest {

    @Test
    public void testInsert() {

        final MaxPQ<Element> elementMaxPQ = new MaxPQ<Element>(4);
        elementMaxPQ.insert(new Element("5"));
        elementMaxPQ.insert(new Element("3"));
        elementMaxPQ.insert(new Element("1"));
        elementMaxPQ.insert(new Element("4"));

        System.out.println(elementMaxPQ);

    }

    @Test
    public void testDelMax() {

        final MaxPQ<Element> elementMaxPQ = new MaxPQ<Element>(4);
        elementMaxPQ.insert(new Element("1"));
        elementMaxPQ.insert(new Element("4"));
        elementMaxPQ.insert(new Element("5"));
        elementMaxPQ.insert(new Element("3"));
        System.out.println(elementMaxPQ.delMax());
    }
}
