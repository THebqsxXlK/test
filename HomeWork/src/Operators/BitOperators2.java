package Operators;

public class BitOperators2 {

    public static void main(String[] args) {

        int a = -42;
        int b = -15;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        int g = b >> 2;
        int h = b >>> 2;
        int k = a << 2;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("Побитовый OR:\n a | b = " + Integer.toBinaryString(c));
        System.out.println("Побитовый AND:\n a & b = " + Integer.toBinaryString(d));
        System.out.println("Побитовый исключающее OR:\n a ^ b = " + Integer.toBinaryString(e));
        System.out.println("Побитовый унарный оператор NOT:\n ~ b = " + Integer.toBinaryString(f));
        System.out.println("Сдвиг вправо:\n b>> = " + Integer.toBinaryString(g));
        System.out.println("Сдвиг вправо с заполнением нулями:\n b>>> = " + Integer.toBinaryString(h));
        System.out.println("Сдвиг влево:\n a<< = " + Integer.toBinaryString(k));

    }

}
