package com.company;

import java.sql.SQLOutput;

public class Main37 {
    public static void main(String[] args) {
        int[] array = {678, 345, 1, 456, 56, -7};
        int max = getMax(array);
        int min = getMin(array);
        System.out.println(max + " " + min);

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
