package oop;

public class Lamp {
    public boolean state;
    int km;


    public void on() {
        state = true;
    }

    public void off() {
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    static int counter;

    public static void metCounter(){
        counter++;
        System.out.println("Value of counter = " + counter);
    }
}