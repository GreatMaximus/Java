package com.company;

public class FinalStatic {
    public static void main(String[] args) {
        int x = FinalStaticDemo.a;
        System.out.println(x);
        System.out.println(FinalStaticDemo.Do(10));
        FinalStaticDemo object = new FinalStaticDemo();
        System.out.println(object.Doo(10));
        FinalStaticDemo.a = 20;
        object.b = 20;
        System.out.println(x + " " + FinalStaticDemo.a);
        System.out.println(object.a);
        System.out.println(object.b);
    }
}
