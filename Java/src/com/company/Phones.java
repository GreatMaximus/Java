package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo Apple = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo Nokia = new PhonesDemo("3310",100,2);
        PhonesDemo2 Xiaomi = new PhonesDemo2( 200,128,"Z10","Black");
        PhonesDemo2 Motorola = new PhonesDemo2 (150, 128, "M10", "Black", 100, 2);
        PhonesDemo3 Huawei = new PhonesDemo3("Android KitKat 6", "Intel");
        PhonesDemo3 LG = new PhonesDemo3("5567","Black", 500, 512, "Core 6", "Intel");

        Apple.model = "XR";
        Apple.price = 600;
        Apple.memory = 128;
        Samsung.model = "S21";
        Samsung.price = 400;
        Samsung.memory = 256;
        System.out.println(Apple.model + " " + Apple.price + " "+ Apple.memory);
        System.out.println(Samsung.model + " " + Samsung.price + " "+ Samsung.memory);
        System.out.println(Nokia.model + " " + Nokia.price + " "+ Nokia.memory);
        System.out.println(Xiaomi.model + " " + Xiaomi.color + " " + Xiaomi.memory + " " + Xiaomi.price);
        System.out.println(Motorola.model + " " + Motorola.color + " " + Motorola.memory + " " + Motorola.mps + " " + Motorola.amountOfCameras + " " + Motorola.price);
        System.out.println(Huawei.systems +  " " + Huawei.cpu);
        System.out.println(LG.model + " " + LG.color + " " + LG.memory + " " + LG.price + " " + LG.systems +  " " + LG.cpu);
    }
}
