package com.company;

import java.util.Arrays;

public class Main39_2 {
    public static void main(String[] args) {
        int[] prime= new int[1000];
        int n = 0;
        for(int i = 0;n<prime.length;i++){
            if(checkPrime(i)){
                prime[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(prime));
    }
    public static boolean checkPrime (int num){
        if(num<2){
            return false;

        }
        for(int i = 2; i <num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
