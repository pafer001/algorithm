package com.learn.algorithm._2;

public class ShellSort extends BaseSort {

    public static void sort(Comparable[] a) {

        int N = a.length;
        int h = getFirstH(N);

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static int getFirstH(int N) {
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        return h;
    }
}
