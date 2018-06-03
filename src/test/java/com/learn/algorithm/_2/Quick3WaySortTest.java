package com.learn.algorithm._2;

import org.junit.Test;

public class Quick3WaySortTest {

    @Test
    public void testSort() {


        Element [] elements = new Element[]{new Element("A"), new Element("c"),
                new Element("D"), new Element("C")};
        Quick3WaySort.sort(elements);
        Quick3WaySort.show(elements);
    }
}
