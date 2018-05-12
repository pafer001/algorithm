package com.learn.algorithm._1.search;


/**
 * 递归的二分查找
 */
public class RecursionBinarySearch {


    /**
     * 从数组array查询key
     * @param key
     * @param array
     * @return
     */
    public static int rank(int key, int[] array)  {
        if (array == null || array.length == 0) {
            return -1;
        }
        return rank(key, array, 0, array.length -1);
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
