package Operators;

public class BitOperators1 {
    public static void main(String [] args){
        int a = 42;
        int b = 15;

        //Побитовые операторы
        String binaryResult1 = Integer.toBinaryString(a);
        String binaryResult2 = Integer.toBinaryString(b);

        System.out.println("Бинарный перевод числа a: " + binaryResult1);
        System.out.println("Бинарный перевод числа b: " + binaryResult2);

        //Унарный оператор NOT (Не), ~

        int resultOperate1 = ~a;
        String binaryResult3 = Integer.toBinaryString(resultOperate1);

        int resultOperate2 = ~b;
        String binaryResult4 = Integer.toBinaryString(resultOperate2);

        System.out.println("Результат операции Унарный оператор NOT: " + binaryResult3);
        System.out.println("Результат операции Унарный оператор NOT: " + binaryResult4);

        //Побитовый AND

        int resultOperate3 = a & b;
        String binaryResult5 = Integer.toBinaryString(resultOperate3);
        System.out.println("Результат операции: Побитовый AND: " + binaryResult5);

        //Побитовый OR
        int resultOperate6 = a | b;
        String binaryResult8 = Integer.toBinaryString(resultOperate6);
        System.out.println("Результат операции: Побитовый OR: " + binaryResult8);

        //Побитовый исключающее OR
        int resultOperate8 = a ^ b;
        String binaryResult10 = Integer.toBinaryString(resultOperate8);
        System.out.println("Результат операции: Побитовый исключающее OR: " + binaryResult10);

        //Сдвиг вправо

        int resultOperate10 = a >> 2;
        String binaryResult12 = Integer.toBinaryString(resultOperate10);
        System.out.println("Результат операции: Сдвиг вправо: " + binaryResult12);

        //Сдвиг вправо с заполнением нулями

        int resultOperate11 = a >>> 2;
        String binaryResult13 = Integer.toBinaryString(resultOperate11);
        System.out.println("Результат операции: Сдвиг вправо с заполнением нулями: " + binaryResult13);

        //Сдвиг влево

        int resultOperate12 = a << 2;
        String binaryResult14 = Integer.toBinaryString(resultOperate12);
        System.out.println("Результат операции: Сдвиг влево: " + binaryResult14);

        //Побитовый исключающее OR с присваиванием

        int resultOperate9 = a ^= 2;
        String binaryResult11 = Integer.toBinaryString(resultOperate9);
        System.out.println("Результат операции: Побитовый исключающее OR с присваиванием: " + binaryResult11);

        //Побитовый AND с присваиванием
        int resultOperate4 = a &= 45;
        String binaryResult6 = Integer.toBinaryString(resultOperate4);
        System.out.println("Результат операции: Побитовый AND с присваиванием: " + binaryResult6);

        int resultOperate5 = b &= 45;
        String binaryResult7 = Integer.toBinaryString(resultOperate5);
        System.out.println("Результат операции: Побитовый AND с присваиванием: " + binaryResult7);

        //Побитовый OR с присваиванием
        int resultOperate7 = a |= 2;
        String binaryResult9 = Integer.toBinaryString(resultOperate7);
        System.out.println("Результат операции: Побитовый OR с присваиванием: " + binaryResult9);

    }
}