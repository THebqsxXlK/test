package methods;

public class Jarvis {

    public void sayHi(String...names) {
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }
}