package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main6 {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter some value");
        int num = scn.nextInt();
        switch(num){
            case 5:
                System.out.println("num = 5");
                break;
            case 10:
                System.out.println("num = 10");
                break;
            case 15:
                System.out.println("num = 15");
                break;
            default:
                System.out.println("Error");
        }
    }
}
