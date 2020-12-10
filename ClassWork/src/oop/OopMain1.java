package oop;

import oop.Animal.Animal;

public class OopMain1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setAge(10);
        animal1.setNick("Антоша");

        int age = animal1.getAge();
        String nick = animal1.getNick();
        System.out.println(age);
        System.out.println(nick);
    }
}
