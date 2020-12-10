package HomeWork2.Loops;

public class Loops4 {



    //1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
    // https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0

        public static void main(String[] args) {

            for (int j = 1; j < 10; j++) {

                for (int i = 2; i <= 10; i++) {
                    //result = i * j;
                    System.out.print(i + " * " + j + " = " + (i * j) + "  |  ");
                }
                System.out.println();

            }
        }
}