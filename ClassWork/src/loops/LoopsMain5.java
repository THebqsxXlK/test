package loops;

import java.util.Arrays;

public class LoopsMain5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayNumber(1, 10, 3)));
        System.out.println(Arrays.toString(getArrayNumber(2, 10, 3)));
        System.out.println(Arrays.toString(getArrayNumber(3, 10, 3)));
        System.out.println(Arrays.toString(getArrayNumber(3, 9, 3)));
        System.out.println(Arrays.toString(getArrayNumber(-2, 17, 29)));
        System.out.println(Arrays.toString(getArrayNumber(-10, 17, 29)));
        System.out.println(Arrays.toString(getArrayNumber(-100, 17, 29)));
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
        int leftCount = 0;
        for (int i = from; i <= to; i++){
            if(i % number != 0){
                leftCount++;
            } else {
                break;
            }
        }

        int rightCount = 0;
        for (int i = to; i >= from; i--){
            if(i % number != 0){
                rightCount++;
            } else {
                break;
            }
        }

        int countElementAll = (to - rightCount) - (from + leftCount);
        int countElementExcluded = countElementAll / number;
        int[] array = new int[countElementAll - countElementExcluded + leftCount + rightCount];


        int i = 0;
        for (int j = from; j <= to ; j++) {
            if (j % number != 0){
                array[i++] = j;
            }
        }


        return array;
    }
}
