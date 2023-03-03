package com.company;

public class Main23 {
    public static void main(String[] args) {
        int num = 5;
        int range = 0;
        int result = 1;


        while(true){
            if(range<1){
                System.out.println(num + "^" + range + " = 1");
                range++;
            }else {
                result = num * result;

                System.out.println(num + "^" + range + " = " + result);
                range++;
                if (range > 10) {
                    break;
                }
            }
        }
    }
}

