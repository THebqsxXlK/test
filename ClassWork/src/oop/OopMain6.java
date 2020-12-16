package oop;

import oop.box.BoxIncorrect;
import oop.box.BoxSmart;

public class OopMain6 {
    public static void main(String[] args) {
        BoxSmart box1 = new BoxSmart();
        box1.setHeight(10);
        box1.setWidth(10);
        box1.setDepth(10);

        BoxSmart box3 = new BoxSmart();
        box3.setHeight(0.5);
        box3.setWidth(6);
        box3.setDepth(11);

        BoxIncorrect box2 = new BoxIncorrect();
        box2.setHeight(10);
        box2.setWidth(10);
        box2.setDepth(10);

        BoxIncorrect box4 = new BoxIncorrect();
        box4.setHeight(104);
        box4.setWidth(654);
        box4.setDepth(0.1);

        System.out.println("=======BOX1=======");
        System.out.println(box1);
        System.out.println(box1.volume());

        System.out.println("=======BOX2=======");
        System.out.println(box2);
        System.out.println(box2.volume());

        System.out.println("=======BOX3=======");
        System.out.println(box3);
        System.out.println(box3.volume());

        System.out.println("=======BOX4=======");
        System.out.println(box4);
        System.out.println(box4.volume());
    }
}
