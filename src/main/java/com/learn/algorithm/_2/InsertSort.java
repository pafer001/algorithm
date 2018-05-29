package com.learn.algorithm._2;

public class InsertSort extends BaseSort {

    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j-1])) {

                    System.out.println(i + " , " + j);
                    exch(a, j, j - 1);
                }
            }
        }
    }
}
