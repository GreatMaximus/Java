package com.company;

public class Try3 {
    public static void main(String[] args){
        int [] array = {3, 0, 136, 56, 666};
        int max = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                index = i;
            }

        }
        System.out.println(max);
        System.out.println(index);


            }

        }








