package com.company;

public class CarGearBox extends CarDemo{
    public String GearBox;

    CarGearBox(){

    }
    CarGearBox(String model, String color, String GearBox, int price){
        super(model, color, price);
        this.GearBox = GearBox;

    }
}
