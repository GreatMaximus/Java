package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        int count = 0;
        int totalLetters = 0;
        int totalWorlds = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some word or sentences");
        String someString = scn.nextLine();
        System.out.println( "Please write some character");
        char someChar = scn.next().charAt(0);
        String[] array = someString.split(" ");

        for(int i=0;i<someString.length();i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
            if(someString.charAt(i) != ' ') {
                totalLetters++;
            }
        }
        for(String word:array){
            if(!word.equals("")) {
                totalWorlds++;
            }
        }
        System.out.println(totalLetters);
        System.out.println("In a word/sentences '" + someString + "' character '" + someChar + "' seems " + count + " times");
        System.out.println("Total letters are " + totalLetters);
        System.out.println("Total worlds are " + totalWorlds);
    }
}
