package com.company;

import java.util.Scanner;

public class Pult2 {
    public static void main (String [] args){
        System.out.println(TVMoving());


    }
    public static String TVMoving (){
        String TVOn;
        Scanner scn = new Scanner (System.in);
        System.out.println("Put 'TV on', if you want it");
        TVOn = scn.nextLine();
        return TVOn;
    }
}
