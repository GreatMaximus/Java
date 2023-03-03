package com.company;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        String [] months ={"january", "february", "march", "april", "may", "june", "july", "august", "september", "october",
       "november", "december"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter a month number: ");
        int month = scn.nextInt();

//        if (month > 12 || month < 0){
//            System.out.println( "Error");
//        }else{
//            System.out.println(months[month-1]);
//        }
        if (month>0 && month<13){
            System.out.println(months[month-1]);
        }else{
            System.out.println( "Error");
        }
    }
}

