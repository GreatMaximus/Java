package com.company;

import java.util.Scanner;

public class Try4 {
    public static void main(String[] args) {
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october",
                "november", "december"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter a month number: ");
        int month = scn.nextInt();
        switch(month){
            case 1:
                System.out.println(months[0]);
                break;
            case 2:
                System.out.println(months[1]);
                break;
            default:
                System.out.println("Error");
        }

        }

    }
