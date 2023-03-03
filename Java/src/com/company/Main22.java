package com.company;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        int num1,num2,result;
        String Yes_No;
        boolean isTrue;
        boolean isTrue2 = true;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.println("This is a game");
        while(isTrue2){
            isTrue = true;
            System.out.println("Game rules: first number is a secret. Sum of two numbers must be lower than 50");
            num1 = (int) Math.round(Math.random()*50);
            System.out.println("Please, write a second number: ");
            num2 = scn.nextInt();
            while(isTrue){
                if(num2<25){
                    System.out.println("Second number must be bigger than 25");
                    System.out.println("Please, write a number again");
                    num2 = scn.nextInt();
                }else{
                    result = num1+num2;
                    if(result>50){
                        System.out.println("Game over, because some of two numbers is "+ result);
                    }else{
                        System.out.println("You won the game, because some of two numbers is "+ result);
                    }
                    isTrue = false;
                }

            }
            System.out.println("Would you like to play again? (Yes/No)");
            Yes_No = scn2.nextLine();
            while(true){
                if(Yes_No.equals("Yes") || Yes_No.equals("No") || Yes_No.equals("yes") || Yes_No.equals("no")){
                    isTrue2=Yes_No.equalsIgnoreCase("Yes");
                    break;
                }else{
                    System.out.println("Error! Please, type Yes or No again: ");
                    Yes_No = scn2.nextLine();
                }

            }

        }

    }
}
