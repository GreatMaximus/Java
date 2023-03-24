package com.company;

import java.util.Scanner;

public class Pult2 {
    public static void main (String [] args){
        Scanner scn = new Scanner (System.in);
        String TVMoving;
        System.out.println("What would you like to do? TV on, TV off, Volume +, Volume -, Channel +, Channel -");
        TVMoving = scn.nextLine();
        switch(TVMoving){
            case "TV on":
                System.out.println(TVOn());
                break;
            case "TV off":
                System.out.println(TVOff());
                break;
            case "Volume +":
                System.out.println(VolumePlus());
                break;
            case "Volume -":
                System.out.println(VolumeMinus());
                break;
            case "Channel +":
                System.out.println(ChannelPlus());
                break;
            case "Chanel -":
                System.out.println(ChannelMinus());
                break;

            default:
                System.out.println("Error");
        }


    }
    public static String TVOn (){
        String TVOn = "TV on";
        return TVOn;
    }
    public static String TVOff (){
        String TVOff = "TV off";
        return TVOff;
    }
    public static String VolumePlus (){
        String VolumePlus = "Volume +";
        return VolumePlus;
    }
    public static String VolumeMinus () {
        String VolumeMinus = "Volume -";
        return VolumeMinus;
    }
        public static String ChannelPlus (){
            String ChannelPlus = "Channel +";
            return ChannelPlus;
        }
        public static String ChannelMinus (){
            String ChannelMinus = "Volume -";
            return ChannelMinus;
    }
}
