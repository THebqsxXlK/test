package HomeWork3;

public class CalculatorWithMathCopy {
    private double methodsWithMath;

    public double addit(double addit1, double addit2) {
        return addit1 + addit2;
    }

    public double subtr(double subtr1, double subtr2) {
        return subtr1 - subtr2;
    }

    public double multiple(double multiple1, double multiple2) {
        return multiple1 * multiple2;
    }

    public double divs(double divs1, double divs2) {
        return divs1 / divs2;
    }

    public double toThePow(double value, double pow) {
        return Math.pow(value, pow);
    }

    public double module(double mdl) {
        return Math.abs(mdl);
    }

    public double Sqrt(double sqrt) {
        return Math.sqrt(sqrt);
    }
}