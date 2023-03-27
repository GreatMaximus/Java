package com.company;

public class MainPhoneNested {
    class Memory{
        String memory = "Switched off";
        public void memoryOn(){
            memory = "Switching on";
            System.out.println(memory);
        }
        public void memoryOff(){
            memory = "Switching off";
            System.out.println(memory);
        }
    }
    class ModelType{
        String modelType = "some model";
        public void typeAndroid(){
            modelType = "Android";
            System.out.println(modelType);
        }
        public void typeIOS(){
            modelType = "IOS";
            System.out.println(modelType);
        }
    }
    Memory ram = new Memory();
    ModelType type = new ModelType();
}
