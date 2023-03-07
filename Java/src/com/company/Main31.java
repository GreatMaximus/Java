package com.company;

public class Main31 {
    public static void main(String[] args) {
        try{
            int [] num = {1,2,3};
            System.out.println(num[3]);
        }catch (Exception e){
            System.out.println( "Somme error: " + e);
        }finally {
            System.out.println("Hello world");
        }

    }
}
