package com.company;

public class MyInterface2 implements ArrayInterface{
    int[] a = new int[3];
    int index = 0;

    @Override
    public boolean Add(int value) {
        if(index != a.length){
            a[index] = value;
            index++;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int Get(int index) {
        return a[index];
    }
}
