package com.company;

public class MyInterface implements PrintInterface, ReadInterface{
    String mark;
    String model;

    MyInterface(String mark, String model){
        this.mark = mark;
        this.model = model;
    }
    MyInterface(){

    }

    @Override
    public void printCar(){
        System.out.println(mark + " " + model);
    }

    @Override
    public void printBike(){
        System.out.println(mark + " " + model);

    }
    @Override
    public void readCar(){
        System.out.println("BMW 530");
    }
    @Override
    public void readBike(){
        System.out.println("Yamaha Z1");
    }


}
