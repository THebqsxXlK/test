package Operators;

import java.util.Scanner;

public class ControlFlowStatements1{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        String nam1 = "Вася";

        if (name.equals(nam1)){

            System.out.printf("Привет," + name +
                    "\nЯ тебя так долго ждал. \n");
            in.close();
        }
        //1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".

    }
}
