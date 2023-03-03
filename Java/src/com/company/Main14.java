package com.company;

public class Main14 {
    public static void main (String [] args){
        float sum=0;
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i< array.length; i++){
            sum = sum + array[i];
            sum+= array[i];
        }
        float average =sum/array.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
