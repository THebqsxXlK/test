package oop;

import oop.phone.SmartPhone;

public class OopMain5 {
    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone();
        smartPhone1.call("Grandmother");
    }

    public static class OopMain1 {
        public static void main(String[] args) {
            OopMain2.Animal animal1 = new OopMain2.Animal();
            animal1.age = 10;
            animal1.nick = "Андрюша";


            System.out.println(animal1.age);
            System.out.println(animal1.nick);
        }
    }
}
