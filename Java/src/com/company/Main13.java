package com.company;

public class Main13 {
    public static void main (String [] args){
        int sum = 0;
        int[] array = {1,2,3,4,5,6,7,8,9,10};
<<<<<<< HEAD
        for (int i = 0; i<array.length; i++){

            System.out.println (array[i]);
        }
=======
        for (int i = 0; i< array.length; i++){
            sum = sum+ array[i];
>>>>>>> 31c6a64353264ed6bc2a602c7620e1a885f4f453

        }
        System.out.println(sum);
    }
}
