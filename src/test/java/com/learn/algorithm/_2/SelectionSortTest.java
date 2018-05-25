package com.learn.algorithm._2;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

public class SelectionSortTest {

    @Test
    public void testSort() {


        Element [] elements = new Element[]{new Element("A"), new Element("c"),
                new Element("D"), new Element("C")};
        SelectionSort.sort(elements);
        SelectionSort.show(elements);
    }
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

        @Override
        public String toString() {
            return "Element{" +
                    "ch='" + ch + '\'' +
                    '}';
        }
    }


}
