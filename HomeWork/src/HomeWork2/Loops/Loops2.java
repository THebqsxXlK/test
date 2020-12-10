package HomeWork2.Loops;

import java.util.Scanner;

public class Loops2 {



    //1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
    // Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
    //		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
    //		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
    //		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numberIn = in.nextInt();

        int a = 0;
        int numberWithoutLast = 0;
        int e = 0;
        int result = 1;

        int lengthOfNumberIn = String.valueOf(numberIn).length();
        int[] numbers = new int[lengthOfNumberIn];
        String[] strings = new String[lengthOfNumberIn];

        for (int i = 1; i <= numbers.length; i++) {

            numberWithoutLast = numberIn / 10;
            numbers[e] = numberIn % 10;
            numberIn = numberIn / 10;
            strings[e] = numbers[e] + " ";
            e++;
        }

        String temp;

        for (int i = 0; i < strings.length/2; i++) {
            temp = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = strings[i];
            strings[i] = temp;
        }


            for (int i = 0; i < numbers.length; i++) {

                //System.out.println(numbers[i]);
                result = result * numbers[i];

            }

        StringBuilder stringClear = new StringBuilder();
        String delimiter = ""; //создаем разделитель
        for(String element: strings) {
            stringClear.append(delimiter).append(element);
            delimiter = "* ";
        }

            System.out.println();
            System.out.println(stringClear + "= " + result);

        }
    }