package com.company;

import java.util.Arrays;

public class Main28_2 {
    public static void main(String[] args) {
        int [] array = new int[] {1,1,1,1,2,2,3,4,5,5,-1,-1,-10,-2,-10,7,7,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int someValue = array[0];
        System.out.println(someValue);
        for(int i=1; i< array.length;i++){
            if(someValue != array[i]){
                someValue = array[i];
                System.out.println(someValue);
            }
        }
    }
}
