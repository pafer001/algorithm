package com.learn.algorithm._1.search;

import org.junit.Test;

public class RecursionBinarySearchTest {

    @Test
    public void testRank() {
        int array[] = {1,3,5,7,10,16};
        assert RecursionBinarySearch.rank(7, array) == 3;
    }

    @Test
    public void testRankByNullPoint() {
        int array[] = null;
        assert RecursionBinarySearch.rank(7, array) == -1;
    }
}
