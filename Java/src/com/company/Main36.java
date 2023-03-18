package com.company;

public class Main36 {
    public static void main(String[] args) {
        boolean isTrue = oddOrEven(9987654);
        System.out.println(isTrue);
    }
    public static boolean oddOrEven(int num){
        if(num % 2 == 0){
            return true;
        }else return false;
    }
}
