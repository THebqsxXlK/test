package Operators;

import java.util.Scanner;

public class ControlFlowStatementsProba {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        switch (name) {

            case 1:
                name = "Вася";
                System.out.printf("Привет," + name +
                        "\nЯ тебя так долго ждал. \n");
                in.close();
                break;

            case 2:
                name = "Анастасия";

                System.out.printf(name + "\nЯ тебя так долго ждал. \n");
                in.close();
                break;

            default:
                name = "a";
                System.out.printf("\nДобрый день, а вы кто?\n");
        }
    }
}
