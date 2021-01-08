package methods;

public class Method1 {

    public static void main(String[] args) {
        String name1 = "Kevin";


        System.out.println("KJHFOHwflm".toLowerCase());

        NamesMeth.display("John", 25,80);
        NamesMeth.display("Ivan", 22,65);
        NamesMeth.display(name1, 22,65);

        SumNums.outNums(3,4,2,7);
        SumNums.outNums(10,4,2,7,8);

        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("John");

        dog1.woof();


    }
}