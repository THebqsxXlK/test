package oop;

import oop.lamp.Lamp;

public class OopMain7 {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.on();

        System.out.println(lamp1.getState());

        lamp1.off();

        System.out.println(lamp1.getState());

        Lamp lamp2 = new Lamp();
        lamp2.on();

        System.out.println("lamp1 = " + lamp1.getState());
        System.out.println("lamp2 = " + lamp2.getState());
    }
}
