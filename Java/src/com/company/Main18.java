package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Scanner scn2 =new Scanner(System.in);
        System.out.println("Please, enter a length of array: ");
        int length = scn.nextInt();
        String[] studentsNames = new String[length];
        for (int i = 0; i< studentsNames.length; i++){
            System.out.print("studentsNames[" + i + "] = ");
            studentsNames[i]=scn2.nextLine();
        }
        System.out.println(Arrays.toString(studentsNames));
    }
}
