package com.learn.algorithm._2;

import org.junit.Test;

public class ShellSortTest {

    @Test
    public void testSort() {


        Element [] elements = new Element[]{new Element("A"), new Element("c"),
                new Element("D"), new Element("C")};
        ShellSort.sort(elements);
        ShellSort.show(elements);
    }
}
