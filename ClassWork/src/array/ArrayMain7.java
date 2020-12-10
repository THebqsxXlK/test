package array;

public class ArrayMain7 {

    public static void main(String[] args) {

        int i = 17;
        int result = -1;
        while (i <= 100){
            System.out.println("i=" + i);
            if (i % 13 == 0){
                System.out.println("First number is :" + i);
                break;
            }
            i++;
        }


        }
    }