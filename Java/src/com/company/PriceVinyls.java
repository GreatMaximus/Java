package com.company;

public class PriceVinyls extends MoreVinylsDemo{
    public int price;
    public String resume = "Hey";

    PriceVinyls(){

    }
    PriceVinyls(String typeOfRecord, int numbersOfVinyl, String typeOfSleeve, int year,  String press, int price){
        super(typeOfRecord,numbersOfVinyl,typeOfSleeve, year, press);
        this.price = price;



        }
    public void  resume2 (){
        System.out.println(resume + ", you are lucky one!");



    }


    }
