package com.learn.algorithm._2;

import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testLess() {

        Element A = new Element("A");
        Element B = new Element("B");
        System.out.println(A.compareTo(B));
    }

    class Element implements Comparable<Element> {
        private String ch;

        public Element(String ch) {
            this.ch = ch;
        }

        public String getCh() {
            return ch;
        }

        public void setCh(String ch) {
            this.ch = ch;
        }

        @Override
        public int compareTo(Element o) {
            return ch.compareTo(o.ch);
        }
    }


}
