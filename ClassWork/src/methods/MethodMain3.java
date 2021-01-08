package methods;

public class MethodMain3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.km = 54984;

        Car car2 = new Car();
        car2.km = 100;

        System.out.println("car1 " + car1.km);
        System.out.println("car2 " + car2.km);
    }
    public static class Car {
        static int km;
    }
}