package tips;

import java.util.Objects;
import java.util.Scanner;

public class Tips1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите имя");
        String name = scanner.nextLine();

        if (Objects.equals(name, "Вася")) {

            System.out.println("Привет");
            System.out.println("Я тебя так долго ждать");

        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждать");

        }
        if (!Objects.equals(name, "Вася")) {
            if (!Objects.equals(name, "Анастасия")) ;
            System.out.println("Вы кто?");

        }
    }
}