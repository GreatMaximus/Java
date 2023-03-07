package com.company;

import java.util.Arrays;

public class Main28 {
    public static void main(String[] args) {
        int [] array = new int[] {1,1,1,1,2,2,3,4,5,5,-1,-1,-10,-2,-10,7,7,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int length = 1;
        int max=array[0];
        for (int i=1; i<array.length;i++){
            if (max<array[i]){
                max = array[i];
                length++;
            }

        }
        int index = 1;
        int [] array2 = new int[length];
        array2[0]=array[0];
        max = array[0];
        for (int i = 0; i < array.length; i++){
            if(max<array[i]){
                max = array[i];
                array2[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
