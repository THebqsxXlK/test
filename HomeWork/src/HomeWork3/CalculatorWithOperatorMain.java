package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator addition = new CalculatorWithOperator();
        System.out.println(addition.addit(-3, 0.25));

        CalculatorWithOperator subtraction = new CalculatorWithOperator();
        System.out.println(subtraction.subtr(8, 12));

        CalculatorWithOperator multiplication = new CalculatorWithOperator();
        System.out.println(multiplication.multipl(2, 9));

        CalculatorWithOperator division = new CalculatorWithOperator();
        System.out.println(division.divis(5, 10));

        CalculatorWithOperator toThePower = new CalculatorWithOperator();
        System.out.println(toThePower.toThePow(0.7, 4));

        CalculatorWithOperator modulus = new CalculatorWithOperator();
        System.out.println(modulus.modul(-0.45));

        CalculatorWithOperator theSquare = new CalculatorWithOperator();
        System.out.println(theSquare.theSqrt(0.25));
    }
}
