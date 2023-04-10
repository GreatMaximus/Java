package com.company;

enum levels{
    Low,
    Medium,
    Hard,
    Prof
}

public class Main41 {
    public static void main(String[] args) {
        levels value = levels.Hard;
        switch (value){
            case Low:
                System.out.println("Low");
                break;
            case Medium:
                System.out.println("Medium");
                break;
            case Hard:
                System.out.println("Hard");
                break;
            case Prof:
                System.out.println("Prof");
                break;

        }
    }
}
