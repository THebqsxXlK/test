package methods;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void woof() {
        System.out.println("Name of dog " + name + " say \"woof!\"");
    }

    public void run(int meters) {
        System.out.println("Name of dog " + name + " run " + meters);
    }

    public String getName() {
        return name;
    }

    public void name() {
    }
}