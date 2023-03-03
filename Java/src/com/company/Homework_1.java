package com.company;

public class Homework_1 {
public static void main (String [] args){
    int [] array = {678, 345, 1, 456, 56, -7};
    int max = array[0];
    int min = array[0];
    for (int i = 0; i < array.length; i++){
       if(max<array[i]) {
           max = array[i];
       }
       if(array[i]<min){
           min = array[i];
       }
    }
    System.out.println("Biggest number is " + max);
    System.out.println("Lowest number is " + min);
        }
 }





