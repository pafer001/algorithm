package com.learn.algorithm.array;

public class ArrayUtils {

    public static double findMaxValue(double array[]) {

        if (array == null || array.length == 0) {
            throw new NullPointerException("array is empty");
        }

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


    public static double[] reverse(double array[]) {

        if (array == null || array.length == 0) {
            throw new NullPointerException("array is empty");
        }

        int length = array.length;
        for (int i =0; i< array.length / 2; i++) {


            double tmp = array[i];
            array[i] = array[length - 1 - i];
            array[length - i - 1] = tmp;
        }

        return array;
    }
}
