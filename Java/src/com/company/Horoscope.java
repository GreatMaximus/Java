package com.company;

import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter your day of birth");
        int date = scn.nextInt();
        System.out.println("Please, enter your month of birth");
        int month = scn.nextInt();
        System.out.println(date + "." + month);
        if ((date >= 20 || month == 1) && (date <= 18 || month == 2)) {
            System.out.println("Водолей");
        } else if ((date >= 19 || month == 2) && (date <= 20 || month == 3)) {
            System.out.println("Рыбы");
        } else if ((date >= 22 || month == 12) && (date <= 19 || month == 1)) {
            System.out.println("Козерог");
        } else if ((date >= 22 || month == 11) && (date <= 21 || month == 12)) {
            System.out.println("Стрелец");
        } else if ((date >= 23 || month == 10) && (date <= 21 || month == 11)) {
            System.out.println("You are Scorpion");
        } else if ((date >= 23 || month == 9) && (date <= 22 || month == 10)) {
            System.out.println("Весы");
        } else if ((date >= 23 || month == 8) && (date <= 22 || month == 9)) {
            System.out.println("Дева");
        } else if ((date >= 23 || month == 7) && (date <= 22 || month == 8)) {
            System.out.println("You are Lion");
        } else if ((date >= 21 || month == 6) && (date <= 22 || month == 7)) {
            System.out.println("Рак");
        } else if ((date >= 21 || month == 5) && (date <= 20 || month == 6)) {
            System.out.println("Близнецы");
        } else if ((date >= 21 || month == 4) && (date <= 20 || month == 5)) {
            System.out.println("Телец");
        } else if ((date >= 21 || month == 3) && (date <= 20 || month == 4)) {
            System.out.println("Овен");
        }
    }
}
