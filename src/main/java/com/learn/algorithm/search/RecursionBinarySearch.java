package com.learn.algorithm.search;


public class RecursionBinarySearch {


    /**
     * 从数组array查询key
     * @param key
     * @param array
     * @return
     */
    public static int rank(int key, int[] array)  {

        return rank(key, array, 0, array.length -1
        );
    }

    public static int rank(int key, int array[], int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (array[mid] < key) {
            return rank(key, array, mid + 1, high);
        } else if (key < array[mid] ) {
            return rank(key, array, low, mid - 1);
        } else {
            return mid;
        }
    }
}
