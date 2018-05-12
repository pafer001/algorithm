package com.learn.algorithm._1.search;

/**
 * @author wangzhenya
 * for二分查找
 */
public class BinarySearch {

    public static int rank(int[] array, int key) {

        if (array == null) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            int tmp = array[mid];
            if (tmp == key) {
                return mid;
            } else if (tmp < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = (low + high) /2 ;
        }

        return -1;
    }
}
