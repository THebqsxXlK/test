package HomeWork2.Arrays;


//.1 Написать метод public static int[] arrayFromConsole() рядом с main.
// Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
// Пример int[] container = arrayFromConsole().
// Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (5) и его элементы по порядку {4, 17, 32}.
// Соответсвенно будет создан массив размером 5 с элементами {4, 17, 32} и сохранён в переменную container.

import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("Input array length: ");
        //int a = input.nextInt();

        //System.out.println("Input elements of array: ");
        //int b = input.nextInt();
        arrayFromConsole(2 , 4);

    }

    /**
     * This method return
     * @param b elements of array
     * @param a length of array
     * @return
     */

    public static int arrayFromConsole(int a, int b) {

        int [] container = new int [a];

        for (int i = 0; i < a; i++) {
            container[i] = b; // inserting array

        }
        return a;

    }

}
