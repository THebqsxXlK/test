package HomeWork2.Arrays;


    //.1 Написать метод public static int[] arrayFromConsole() рядом с main.
    // Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
    // Пример int[] container = arrayFromConsole().
    // Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (5) и его элементы по порядку {4, 17, 32}.
    // Соответсвенно будет создан массив размером 5 с элементами {4, 17, 32} и сохранён в переменную container.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = input.nextInt();
        System.out.println("Input b: ");
        int b = input.nextInt();
        System.out.println(sum(a, b));

    }

    public static int sum(int a, int b) {

        return a + b;
    }
}