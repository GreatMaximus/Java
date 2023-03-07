package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main27 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lada");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        cars.set(2, "Mercedez-Benz");
        System.out.println(cars);
        cars.add(3,"Porsche");
        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.clear();
        System.out.println(cars);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(310);
        numbers.add(-3);
        numbers.add(45);
        numbers.add(45);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);

    }
}
