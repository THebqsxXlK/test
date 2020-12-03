package Tips;

import java.util.Objects;
import java.util.Scanner;

public class Tips3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите имя");
        final String name = scanner.nextLine();
        final String name2 = name;

        final String girlfriend = "Анастасия";
        final String friend = "Вася";

        switch (name) {

            case friend:
                System.out.println("Привет");

            case girlfriend:
                System.out.println("Я тебя так долго ждать");
                break;

            default:
                System.out.println("Вы кто?");
                break;
        }
    }
}