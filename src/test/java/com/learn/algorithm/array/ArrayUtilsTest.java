package com.learn.algorithm.array;

import org.junit.Test;

public class ArrayUtilsTest {


    @Test
    public void testFindMaxValue() {
        ArrayUtils.findMaxValue(null);
    }

    @Test
    public void testFindMaxValueOneElement() {
        double[] doubles = {1.0};

        assert ArrayUtils.findMaxValue(doubles) == 1.0;
    }

    @Test
    public void testFindMaxValueOManyElement() {
        double[] doubles = {1.0, 9.0, 7.0, 11.0, 4.0};

        assert ArrayUtils.findMaxValue(doubles) == 11.0;
    }

    @Test
    public void testReverse() {
        double[] array = {1.0, 9.0, 7.0, 11.0, 4.0};
        ArrayUtils.reverse(array);
        for (double e : array) {
            System.out.print(e +"\t");
        }

    }

}
