package HomeWork2.Loops;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Loops5 {

    //3. Нарисовать блок схему алгоритма работы пузырьковой сортировки.
    // Результат должен быть в гите и сохранено следующие форматы файлов: (.drawio || .vsdx) && (.pdf || .svg)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input lenght of array: ");
        int lenghtOfArray = input.nextInt();
        int [] array = new int [lenghtOfArray];
        System.out.println("Input array elements");
        int count = 0;

        for (int i = 0; i < lenghtOfArray; i++) {
            array[i] = input.nextInt(); // inserting array
            count = i;

        }
        System.out.println("count: " + ++count);
        System.out.println("Array before sort: " + Arrays.toString(array));

        boolean isSorted = false;
        int exchange;

            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        exchange = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = exchange;
                    }
                }
            }
            System.out.println("Array before sort: " + Arrays.toString(array));
    }
}