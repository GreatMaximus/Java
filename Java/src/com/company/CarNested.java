package com.company;


    class Body {
        String avant;
        String sedan;
        Door door = new Door();

    }

    class Door {
        Window window = new Window();

    }

    class Window {
        public void windowsCount() {
            System.out.println("6");
        }

    }

    public class CarNested {
      Body body = new Body();

        public static void main(String[] args) {
            CarNested someCar = new CarNested();
            someCar.body.door.window.windowsCount();
        }

    }



