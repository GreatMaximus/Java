package com.company;

public class Main17 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,20,30};
       int sum =0;
//        for (int i = 2; i<array.length-3 ;i++){
//            if (array[i] !=7){ // != - not =
//                sum+= array[i];
//            }
//
//        }
//        System.out.println(sum);
        for (int i = 0; i<array.length ;i++){
           if (array[i] !=7 && i>1 && i<array.length-3){ // != - not =
               sum+= array[i];
           }

        }
        System.out.println(sum);

    }
}
