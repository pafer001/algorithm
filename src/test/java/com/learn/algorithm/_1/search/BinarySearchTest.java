package com.learn.algorithm._1.search;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testRank() {
        int array[] = {1,3,5,7,10,16};
        assert BinarySearch.rank (array, 7) == 3;
    }

    @Test
    public void testRankByNullPoint() {
        int array[] = null;
        assert BinarySearch.rank( array, 7) == -1;
    }
}
