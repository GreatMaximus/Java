package com.company;

public class CarEngine extends CarGearBox{
    public String Fuel;
    CarEngine(){

    }
    CarEngine(String model, String color, String GearBox, String Fuel, int price){
        super(model,color,GearBox,price);
        this.Fuel = Fuel;

    }
}
