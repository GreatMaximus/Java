package com.company;

public class PhonesDemo2 {
    public int price;
    public int memory;
    public String model;
    public String color;
    public int mps;
    public int amountOfCameras;

    PhonesDemo2(){

    }
    PhonesDemo2(int price, int memory, String model, String color){
        this.price = price;
        this.memory = memory;
        this.model = model;
        this.color = color;

    }
    PhonesDemo2 (int price, int memory, String model, String color, int mps, int amountOfCameras ){
        this.price = price;
        this.memory = memory;
        this.model = model;
        this.color = color;
        this.mps = mps;
        this.amountOfCameras = amountOfCameras;

    }
}
