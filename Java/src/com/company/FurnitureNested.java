package com.company;

import org.w3c.dom.ls.LSOutput;


    class Bed {

        String sofa = "sofa";
        Table table = new Table();


    }
    class Table {
        Closet closet = new Closet();

    }
    class Closet {

        public void stuff(){
            System.out.println("You have a very big closet");
        }

    }
    public class FurnitureNested {
        Bed bed = new Bed();
        public static void main(String[] args) {
            FurnitureNested furniture = new FurnitureNested();
            furniture.bed.table.closet.stuff();
        }


    }




