package HomeWork2.Loops;

import java.util.Scanner;

public class Loops3 {


    // 1.3. Возведение в степень. Через консоль пользователь вводит два числа.
    // Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
    // Степень - только положительная и целая.
    // Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float numberIn = 0f;
        int raisedToPower = 0;// степень
        do {
            System.out.print("Введите первое число (может быть отрицательным и дробным): ");
            while (!in.hasNextFloat()) {
                System.out.println("Это не число. Введите отрицательное или дробное число: ");
                in.next();
            }
            numberIn = in.nextInt();
        } while (numberIn == 0);
        System.out.println("Ваше возводимое число = " + numberIn);

        do {
            System.out.print("Введите степень (только положительное и целое): ");
            while (!in.hasNextInt()) {
                System.out.println("Неверный тип данных. Введите отрицательное или дробное число: ");
                in.next();
            }
            raisedToPower = in.nextInt();
        } while (raisedToPower <= 0);
        System.out.println("Степень возведения = " + raisedToPower);

        float result = numberIn;

        for (int i = 1; i < raisedToPower; --raisedToPower) {
            result = result * numberIn;
        }

        System.out.println(result);

    }
}