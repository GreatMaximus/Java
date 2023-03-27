package com.company;
class Memory{
    public void printMemory(){
        System.out.println("RAM");
    }
}
class Model{
    public Memory memory = new Memory();
}
public class MainPhone {
    public Model XR = new Model();
    public static void main(String[] args) {
       MainPhone Apple = new MainPhone();
       Apple.XR.memory.printMemory();
    }

}

