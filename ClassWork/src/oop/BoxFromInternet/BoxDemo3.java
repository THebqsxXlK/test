package oop.BoxFromInternet;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box(2, 5.1, 4);
        Box myBox2 = new Box(2.3, 3.1, 4);

        System.out.println("Объем1 " + myBox1.getVolume());
        System.out.println("Объем2 " + myBox2.getVolume());
    }
}