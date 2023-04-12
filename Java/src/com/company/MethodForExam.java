package com.company;

public class MethodForExam {
    public static void main(String[] args) {
        System.out.println(result());
    }
    public static boolean result (){
        int value = (int) Math.round(Math.random()*100);
        System.out.println(value);
        if(value>50){
            return true;
        }else{
            return false;
        }

    }
}











