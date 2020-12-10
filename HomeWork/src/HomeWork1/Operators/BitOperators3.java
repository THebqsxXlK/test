package HomeWork1.Operators;

public class BitOperators3 {

    public static void main(String[] args) {

        double a = 42.5;
        double b = 15.6;


        float f = (float) a;
        float g = (float) b;

        System.out.println("f = " + (int) f);

        //float c = f | g;

        System.out.println("f = " + Integer.toBinaryString((int) f));
        System.out.println("g = " + Integer.toBinaryString((int) g));
        //  System.out.println("Побитовый OR:\n a | b = " + Integer.toBinaryString((int) f));


    }

}
