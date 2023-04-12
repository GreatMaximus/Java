package com.company;

public class MoreVinylsDemo extends VinylsDemo {
    public int year;
    public String press;

    public String deal = "It is a good deal";

    MoreVinylsDemo() {

    }

    MoreVinylsDemo(String typeOfRecord, int numbersOfVinyl, String typeOfSleeve, int year, String press) {
        super(typeOfRecord, numbersOfVinyl, typeOfSleeve);
        this.year = year;
        this.press = press;
    }

    public void resume1() {
        System.out.println(deal + ", you are lucky one!");

    }


}
