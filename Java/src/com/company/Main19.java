package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, enter a length of array: ");
            int length = scn.nextInt();
            int[] numbers = new int[length];
            int[] numbers2;
            int count = 0;
            int index = 0;

            for (int i = 0; i< numbers.length; i++){
                System.out.print("numbers[" + i + "] = ");
                numbers[i]=scn.nextInt();
                if (numbers[i] > 50){
                    count++;
                }
            }
            numbers2 = new int[count];
            for(int i =0; i<length;i++){
                if(numbers[i]>50){
                    numbers2[index] = numbers[i];
                     index++;
                }
            }
            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(numbers2));
        
    }
}
