package com.company;

public class PhonesDemo3 extends PhonesDemo2{
    public String systems;
    public String cpu;

    PhonesDemo3(){

    }
    PhonesDemo3(String systems, String cpu){
        this.systems = systems;
        this.cpu = cpu;
    }
    PhonesDemo3(String model, String color, int price, int memory, String systems, String cpu){

        super(price, memory, model, color);
        this.systems = systems;
        this.cpu = cpu;

    }

}
