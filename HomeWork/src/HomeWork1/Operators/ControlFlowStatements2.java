package HomeWork1.Operators;

import java.util.Scanner;

public class ControlFlowStatements2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        String nam1 = "Вася";
        String nam2 = "Анастасия";

        if (name.equalsIgnoreCase(nam1)){

            System.out.printf("Привет," + name +
                    "\nЯ тебя так долго ждал. \n");
            in.close();
        }
        else if (name.equalsIgnoreCase(nam2)){

            System.out.printf("\nЯ тебя так долго ждал. \n");
            in.close();
        }
        //      1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
        //		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
        //		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
        //	Как это сделать:
        //		5.1 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if
        //		5.2 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if else if
        //		5.3 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи switch
        //	ВНИМАНИЕ! В примерах if и else if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2").
    }
}
