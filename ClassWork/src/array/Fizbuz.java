package array;
//Вывести на экран числа от 1 до 100. При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
// а вместо чисел, кратных пяти — слово «Buzz».
// Если число кратно и 3, и 5, то программа должна выводить слово «FizzBuzz»
public class Fizbuz {
    public static void main(String[] args) {
        fizzBuzz(0, 100);
    }

    static void fizzBuzz(int from, int to) {
        int[] array = new int[to];
        String[] arrayString = new String[to];

        for (int i = from; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int j = from; j < arrayString.length; j++) {
            //arrayString[j] = j + 1;
            if ((j % 5 == 0) && (j % 3 == 0)) {
                arrayString[j] = "FizzBuzz";
            } else if (j % 3 == 0) {
                arrayString[j] = "Fizz";
            } else if (j % 5 == 0) {
                arrayString[j] = "Buzz";
            } else arrayString[j] = String.valueOf(j);
        }

        for (int k = from; k < arrayString.length; k++) {
            System.out.print(arrayString[k] + " ");
        }
    }
}