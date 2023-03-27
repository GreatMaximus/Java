package com.company;

public class MainAbstract {
    public static void main(String[] args) {
        FigureAbstract object1 = new EllipseAbstact();
        object1.draw();
        FigureAbstract object2 = new TriangleAbstract();
        object2.draw();
        FigureAbstract object3 = new CircleAbstact();
        object3.draw();


    }
}
