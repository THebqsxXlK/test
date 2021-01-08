package oop.BoxFromInternet;

public class Box {

    //Box myBox = new Box();

    double width;
    double height;
    double depth;

//    Box(double width, double height, double depth) {
//        System.out.println("Конструирование объекта Box");
//        double width;
//        double height;
//        double depth;
//    }

    Box(double w, double h, double d) {
        System.out.println("Конструирование объекта Box");
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

