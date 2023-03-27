package com.company;

public class MainInterface {
    public static void main(String[] args) {
        PrintInterface Car = new MyInterface("Audi", "A6");
        PrintInterface Bike = new MyInterface("Honda", "A1");
        ReadInterface Car2 = new MyInterface();
        ReadInterface Bike2 = new MyInterface();
        Car.printCar();
        Bike.printBike();
        Car2.readCar();
        Bike2.readBike();
    }
}
