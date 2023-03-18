package com.company;

import java.util.Arrays;

public class Main35 {
    public static void main(String[] args) {
        String[] array = {"K","O","ZH", "Z", "G", "S", "F"};
        String temp;
        int length = array.length;
        for(int i = 0; i<array.length/2;i++){
            temp = array[length-1-i];
            array[length-1-i] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
