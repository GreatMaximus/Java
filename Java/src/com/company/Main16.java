package com.company;

import java.util.Arrays;

public class Main16 {
    public static void main (String [] args){
        int[] array = {1,2,3,4,5,8,4,3,10};
        int num = 3;
        int num2 = 5;
        for (int i = 0; i< array.length;i++){
            if(array[i] == num  || array[i]== num2){
                array[i] = array[i]*=2;

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
