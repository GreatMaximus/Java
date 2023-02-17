package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main (String [] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Please, enter some value: ");
        int a = scn.nextInt();
        System.out.println("Please, enter some value: ");
        int b = scn.nextInt();
        //

        if (a>10){
            System.out.println("a is bigger than 10");
        }else if (a==10){
            System.out.println("a is 10");
        }
        else{
            System.out.println("a is less than 10");
        }
        // || или && &- амперсанда
        if (a>10 && b>15){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
