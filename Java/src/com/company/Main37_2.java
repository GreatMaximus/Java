package com.company;

public class Main37_2 {
    public static void main(String[] args) {
        int [] array = {678, 345, 1, 456, 56, -7};
        int[] arrayMaxMin = GetMaxAndMinValue(array);
        int max = arrayMaxMin[0];
        int min = arrayMaxMin[1];
        System.out.println(min + " " + max);
    }

    public static int[] GetMaxAndMinValue(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] arrayMaxMin = new int[2];
        arrayMaxMin[0] = max;
        arrayMaxMin[1] = min;
        return arrayMaxMin;
    }
}