package com.company;

public class MyMusic implements MyMusicInterface{
    int value = (int) Math.round(Math.random()*4);
    @Override
    public void play() {
        switch(value){
            case 0:
                System.out.println("Guitar");
                break;
            case 1:
                System.out.println("Drums");
                break;
            case 2:
                System.out.println("Sax");
                break;
            case 3:
                System.out.println("Bass");
                break;
            case 4:
                System.out.println("Keys");
                break;
            default:
                System.out.println("Wrong number");

        }

    }
}
