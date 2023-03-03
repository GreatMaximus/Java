package com.company;

public class Mathematics {
    public static void main(String[] args) {
        float num = 5.5f;
        System.out.println("Round " + Math.round(num));

        float num2 = 5.5f;
        System.out.println("Floor "+ Math.floor(num2));

        float num3 = 5.5f;
        System.out.println("Ceil " + Math.ceil(num3));

        int num4, num5;
        num4 = 10;
        num5 = 20;
        System.out.println("Max " + Math.max(num4,num5));
        System.out.println("Min " + Math.min(num4,num5));

        int num6 = 16;
        System.out.println("Sqrt " + Math.sqrt(num6));

        int num7 = 4;
        System.out.println("Pow " + Math.pow(num7, 3));

        int num8 = (int) Math.round(Math.random()*100);
        System.out.println("Random "+ num8);
    }
}
