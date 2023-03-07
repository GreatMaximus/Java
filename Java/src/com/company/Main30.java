package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        String [] months ={"january", "february", "march", "april", "may", "june", "july", "august", "september", "october",
                "november", "december"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter some month: ");
        String month = scn.nextLine();
        String lowerMonth = month.toLowerCase();
        if(Arrays.asList(months).contains(lowerMonth)){
            int index = Arrays.asList(months).indexOf(lowerMonth)+1;
            System.out.println(index);

        }
    }
}
