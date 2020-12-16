package HomeWork2.Loops;

public class Loops4 {

    //1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
    // https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0

    public static void main(String[] args) {
        System.out.println("ТАблица умножения");
        printRow(2, 5);
        System.out.println();
        printRow(6, 9);
    }

    /**
     * Печать строки с нужными столбцами
     * @param from начальнй столбец
     * @param to   конечный столбец
     */

    public static void printRow(int from, int to) {
        for (int j = 1; j < 10; j++) {

            for (int i = from; i <= to; i++) {
                //result = i * j;
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.print("\n");
        }

    }
}