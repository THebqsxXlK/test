package loops;

import java.util.Arrays;

public class LoopsMain4 {
    public static void main(String[] args) {
        int[] arr = getArrayNumber(1, 100, 2);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Данный метод возвращает массив чисел из диапазана которые не кратные переданному числу
     * @param from начало диапазона
     * @param to конец диапазона (включая)
     * @param number число которые не будут помещены в массив должно быть кратны
     * @return массив чисел из диапазона.
     *  пустой массив - если значение не найдено
     */
    public static int[] getArrayNumber(int from, int to, int number){
        int[] array = new int[to -from];
        int count = 0;

        for (int i = from; i <= to ; i++) {
            if (i % number != 0){
                array[count++] = i;
            }
        }

        return Arrays.copyOf(array, count);
    }
}
