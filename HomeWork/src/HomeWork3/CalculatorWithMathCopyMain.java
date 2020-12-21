package HomeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcCopy = new CalculatorWithMathCopy();

        double dvs = calcCopy.divs(28, 5);
        double pow = calcCopy.toThePow(dvs, 2);
        double multp = calcCopy.multiple(15, 7);
        double addit1 = calcCopy.addit(pow, multp);
        double addit2 = calcCopy.addit(4.1, addit1);

        System.out.printf("%.2f", addit2);

        //4.1 + 15 * 7 + (28 / 5) ^ 2
    }
}