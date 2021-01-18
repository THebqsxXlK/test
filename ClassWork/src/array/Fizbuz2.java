package array;

//Вывести на экран числа от 1 до 100. При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
// а вместо чисел, кратных пяти — слово «Buzz».
// Если число кратно и 3, и 5, то программа должна выводить слово «FizzBuzz»
public class Fizbuz2 {
    public static void main(String[] args) {
        fizzBuzz(0, 100);
    }

    static void fizzBuzz(int from, int to) {
        for (int j = from + 1; j < to + 1; j++) {
            if ((j % 5 == 0) && (j % 3 == 0)) {
                System.out.print("FizzBuzz ");
            }
            else if (j % 3 == 0) {
                System.out.print("Fizz ");
            }
            else if (j % 5 == 0) {
                System.out.print("Buzz ");
            }
            else System.out.print(j + " ");
        }
    }
}