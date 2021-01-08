package methods;

public class Method extends Sum {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;

        sum(a, b);
        sum(4, 3);
        sum(4, a);

        hello();
        welcome();
    }

    static void hello() {
        System.out.println("Hello");
    }

    static void welcome() {
        System.out.println("Welcome to Jva");
    }
}
