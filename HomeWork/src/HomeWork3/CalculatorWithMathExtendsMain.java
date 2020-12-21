package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathExtends calc2 = new CalculatorWithMathExtends();

        double result1 = calc2.divis(28, 5);
        double result2 = calc2.toThePow(result1, 2);
        double result3 = calc2.multipl(15, 7);
        double result4 = calc2.addit(4.1, result3);
        double resultFinal = calc2.addit(result2, result4);

        System.out.printf("%.2f", resultFinal);
    }
}