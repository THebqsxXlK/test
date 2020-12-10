package HomeWork2.Loops;

import java.util.Scanner;

public class Loops1 {


    //1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
    // Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
    // Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    //    	1.1.1. Используя только цикл

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberIn;
        do {
            System.out.print("Введите положительное число до 32: "); //больше нельзя - не влезет результат
            while (!in.hasNextInt()) {
                System.out.println("Это не число. Введите положительное число до 32: ");
                in.next();
            }
            numberIn = in.nextInt();
        } while (numberIn >= 32 || numberIn <= 0); // влепил тут двойное условие. хотел попробовать.
        System.out.println("Ваше число: " + numberIn);

        int c = 1;
        int e = 0; // потому что нужно заносить с нулевого , а не с первого
        int result = 1; // на ноль умножать нельзя на 1ой итерации

        int[] numbers = new int[numberIn];
        String[] strings = new String[numberIn];

        for (int i = 1; i <= numbers.length; i++) { //
            numbers[e] = c * i;
            //System.out.print(numbers[e]);
            strings[e] = numbers[e] + " "; // нужно что-то закинуть в массив стринг, поэтому пробел обязателен
            // знак "*" здесь нельзя, инача последний элекмент массива будет тоже с "*", а нам нужно "=" в конце
            e++;
            result = result * i;
        }

        StringBuilder stringClear = new StringBuilder();
        String delimiter = ""; //создаем разделитель
        for(String element: strings) {
            stringClear.append(delimiter).append(element);
            delimiter = "* ";
        }

        System.out.println(stringClear + "= " + result);

    }
}