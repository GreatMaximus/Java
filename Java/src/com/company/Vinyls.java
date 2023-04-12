package com.company;

public class Vinyls {
    public static void main(String[] args) {
        VinylsDemo LP1 = new VinylsDemo("LP",1, "gatefold");
        MoreVinylsDemo LP2 = new MoreVinylsDemo("LP", 2, "gatefold",1985,"original");
        PriceVinyls EP1 = new PriceVinyls("EP",1, "sleeve", 2020,"reissue", 20);
        LP2.resume1();
        EP1.resume2();
    }
}
