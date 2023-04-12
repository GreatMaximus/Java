package com.company;

import java.util.Arrays;

public class MainProducts {
    public static void main(String[] args) {
         int array[]= {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        ProductsDemo product1 = new ProductsDemo(5, array[4],"Milk");
        System.out.println("Price is " + product1.prices + " and weight is " + product1.weight + " for " + product1.product);
    }
}
