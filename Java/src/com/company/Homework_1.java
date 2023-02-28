package com.company;

public class Homework_1 {
public static void main (String [] args){
    int [] array = {2, 1, 1, 1, 1, 0};
    int max = array[1];
    int min = array[0];
    for (int i = 0; i < array.length; i++){
       if(max<array[i])
           max = array[i];
       if(array[i]<min){
           min = array[i];
       }
    }
    System.out.println("Biggest number is " + max);
    System.out.println("Lowest number is " + min);
        }
 }





