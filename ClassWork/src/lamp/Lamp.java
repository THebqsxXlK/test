package oop.lamp;

public class Lamp {
    private static boolean state;

    public void on(){
        this.state = true;
    }

    public void off(){
        this.state = false;
    }

    public boolean getState() {
        return this.state;
    }
}
