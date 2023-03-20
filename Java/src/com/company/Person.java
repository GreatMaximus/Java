package com.company;

public class Person {
    public static void main(String[] args) {
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        person2.name = "John";
        person1.age = 60;
        System.out.println(person1.age);
        System.out.println(person1.name);
        System.out.println(person1.HairColor);
        System.out.println(person1.height);
        person1.say("Maksim");
        person2.say("Artur");
    }
}


