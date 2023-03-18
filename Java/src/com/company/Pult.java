package com.company;

import java.util.Scanner;

public class Pult {
    public static void main (String [] args){
        System.out.println(moving());


    }
    public static String moving () {
        String TVMoving, TVOn,TVOff,VolumePlus, VolumeMinus, ChanelPlus,ChanelMinus;
        TVOn = "TV on";
        TVOff = "TV off";
        VolumePlus = "Volume +";
        VolumeMinus = "Volume -";
        ChanelPlus = "Chanel +";
        ChanelMinus = "Chanel -";
        Scanner scn = new Scanner (System.in);
        System.out.println("What would you like to do? TV on, TV off, Volume +, Volume -, Chanel +, Chanel -");
        TVMoving = scn.nextLine();
        if(TVMoving.equals("TV On")){
            TVMoving = TVOn;
        }
        else if(TVMoving.equals("TV off")){
            TVMoving = TVOff;
        }
        else if(TVMoving.equals("Volume +")){
            TVMoving = VolumePlus;
        }
        else if(TVMoving.equals("Volume -")){
            TVMoving = VolumeMinus;
        }
        else if(TVMoving.equals("Chanel +")){
            TVMoving = ChanelPlus;
        }
        else if(TVMoving.equals("Chanel -")){
            TVMoving = ChanelMinus;
        }
        return TVMoving;


    }
}
