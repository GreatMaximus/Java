package com.company;

import java.util.Arrays;

public class Main39 {
    public static void main(String[] args) {
        int length = 10000;
        int [] prime = new int [length];
        int n = 0;
        for(int i = 2;n<length;i++){
            boolean isTrue = true;

            for(int j = 2;j<i;j++){
                if(i%j == 0){
                    isTrue = false;
                }
            }
            if(isTrue){
                prime[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(prime));
    }
}
