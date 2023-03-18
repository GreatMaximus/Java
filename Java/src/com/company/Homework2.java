package com.company;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        String[] array = {"K","O","ZH", "Z", "G", "S", "F"};
        String[] array1 = new String [array.length];


        for(int i = array.length-1; i>=0;i--){
            array1[array.length-1-i]=array[i];

        }
        System.out.println(Arrays.toString(array1));





        }

        }

        //for(int i = array.length-1; i >=0;i--){
            //System.out.print(array[i] + " ");






