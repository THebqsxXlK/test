package oop;

import oop.Animal.Dog;

public class OopMain2 {
    public static void main(String[] args) {
        Dog animal1 = new Dog();
        animal1.setAge(10);
        animal1.setNick("Евлампий");

        System.out.println(animal1.getAge());
        System.out.println(animal1.getNick());

        animal1.eat();
        //animal1.sleep();
    }
}