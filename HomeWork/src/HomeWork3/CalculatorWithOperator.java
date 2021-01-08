package HomeWork3;

public class CalculatorWithOperator {

    public double addit(double a, double b) {
        return a + b;
    }

    public double subtr(double c, double d) {
        return c - d;
    }

    public double multipl(double e, double f) {
        return e * f;
    }

    public double divis(double g, double h) {
        return g / h;
    }

    /**
     * @param value    - number
     * @param powValue - value of pow
     * @return
     */
    public double toThePow(double value, double powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = (result * value);
        }
        return result;
    }

    /**
     * @param number
     * @return
     */
    public double modul(double number) {
        return (number < 0) ? number : (-number);
    }


    public double theSqrt(double number) {
        return Math.sqrt(number);
    }
}