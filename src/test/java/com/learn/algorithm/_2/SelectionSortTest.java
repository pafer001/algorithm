package com.learn.algorithm._2;

import org.junit.Test;


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

        Element A = new Element("D");
        Element B = new Element("c");
        System.out.println(A.compareTo(B));
    }


}
