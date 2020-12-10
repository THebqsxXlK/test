package HomeWork2.Arrays;

//.1 Написать метод public static int[] arrayFromConsole() рядом с main.
// Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
// Пример int[] container = arrayFromConsole().
// Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (5) и его элементы по порядку {4, 17, 32}.
// Соответсвенно будет создан массив размером 5 с элементами {4, 17, 32} и сохранён в переменную container.

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {

        int[] result = arrayFromConsole();
        System.out.println(Arrays.toString(result));
    }

    /**
     * @return
     */
    private static int[] arrayFromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array lenght: ");
        int a = input.nextInt();
        int[] container = new int[a];
        System.out.println("Input elements of array: ");

        for (int i = 0; i < a; i++) {
            container[i] = input.nextInt(); // inserting array
        }
        return container;
    }
}

