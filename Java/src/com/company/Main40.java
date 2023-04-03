package com.company;

public class Main40 {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Result is " + result);
    }
    public static int sum (int num){
        if(num>0){
            System.out.println(num);
            return num+sum(num-1);
        }else{
            return 0;
        }
    }
}
