package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main (String [] args){
        Scanner scn = new Scanner (System.in);
        int num, num2, result;
        char sym;
        System.out.println("Enter first number ");
        num = scn.nextInt();
        System.out.println("Please enter an operation(+,-,*,/):" );
        sym = scn.next().charAt(0);

        while(true){
            if(sym!= '+' && sym != '-' && sym != '*' && sym != '/'){
                System.out.println("Incorrect symbol! Please, try again(+,-,*,/)");
                sym = scn.next().charAt(0);
            }else{
                System.out.println("Enter second number ");
                num2 = scn.nextInt();
                switch(sym){
                    case '+' :
                        result = num + num2;
                        System.out.println(result);
                        break;
                    case '-':
                        result = num - num2;
                        System.out.println(result);
                        break;
                    case '*':
                        result = num * num2;
                        System.out.println(result);
                        break;
                    case '/':
                        result = num / num2;
                        System.out.println(result);
                        break;


                }
                break;
            }



        }


    }
}