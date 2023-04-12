package com.company;

public class Vinyl {
    public static void main(String[] args) {
        VinylDemo LP1 = new VinylDemo();
        VinylDemo LP2 = new VinylDemo("Metallica", "72 Seasons", 45);

        LP1.bandName = "Ghost";
        LP1.albumTitle = "Impera";
        LP1.price = 30;

        System.out.println(LP1.bandName +" " + LP1.albumTitle + " " + LP1.price);
        System.out.println(LP2.bandName +" " + LP2.albumTitle + " " + LP2.price);

    }
}
