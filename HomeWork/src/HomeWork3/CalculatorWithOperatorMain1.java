package HomeWork3;

public class CalculatorWithOperatorMain1 {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        System.out.printf("%.2f", calculator.addit(calculator.addit(4.1, calculator.multipl(15, 7)),
                calculator.toThePow((calculator.divis(28, 5)), 2)));
    }
    //4.1 + 15 * 7 + (28 / 5) ^ 2.
}
