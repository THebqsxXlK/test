package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double toThePow(double value, double powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double modul(double number) {
        return Math.abs(number);
    }

    @Override
    public double theSqrt(double number) {
        return Math.sqrt(number);
    }
}