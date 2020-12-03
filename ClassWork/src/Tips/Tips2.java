package Tips;

import java.util.Objects;
import java.util.Scanner;

public class Tips2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите имя");
        String name = scanner.nextLine();
        String friend = "Вася";
        String girlfriend = "Анастасия";

        boolean isFriend = Objects.equals(name, friend);
        boolean isGirlFriend = Objects.equals(name, girlfriend);


        if (Objects.equals(name, friend)) {

            System.out.println("Привет");
            System.out.println("Я тебя так долго ждать");
            return;

        }
        if (Objects.equals(name, girlfriend)) {
            System.out.println("Я тебя так долго ждать");
            return;
        }

        System.out.println("Вы кто?");

    }
}