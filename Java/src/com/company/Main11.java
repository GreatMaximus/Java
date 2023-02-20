package com.company;

public class Main11 {
    public static void main (String [] args){
        int num1 = 0;
        int num2 = 1;
        int result;
        System.out.print(num1 + " " + num2 + " ");
        for( int i = 0; i < 8; i++){
            result = num1 +num2;
            System.out.print(result + " ");
            num1 = num2;
            num2 = result;

        }
    }
}
