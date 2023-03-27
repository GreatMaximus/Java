package com.company;

public class MainPhone2 {
    public static void main(String[] args) {
        MainPhoneNested phone = new MainPhoneNested();
        phone.ram.memoryOn();
        phone.type.typeIOS();

    }
}
