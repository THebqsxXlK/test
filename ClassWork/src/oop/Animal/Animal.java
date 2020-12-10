package oop.Animal;

public class Animal {
    private int age;
    private String nick;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNick(){
        return nick;
    }

    public void setNick(String nick){
        this.nick = nick;
    }

    void eat(){
        System.out.println("Кушаем");
    }

    void sleep(){
        System.out.println("Мы спим");
    }
}
