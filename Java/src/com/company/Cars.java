package com.company;

public class Cars {
    public static void main(String[] args) {
        CarDemo BMW = new CarDemo ("X5", "black", 20000);
        CarGearBox Audi = new CarGearBox("X6", "white", "auto", 30000);
        CarEngine KIA  = new CarEngine("F34", "gray", "mechanics", "gasoline", 1000);





        System.out.println(BMW.model + " " + BMW.color + " " + BMW.price);
        System.out.println(Audi.model + " " + Audi.color + " " +Audi.GearBox + " " + Audi.price);
        System.out.println(KIA.model + " " + KIA.color + " " + KIA.GearBox + " " + KIA.Fuel + " " + KIA.price);

    }
}
