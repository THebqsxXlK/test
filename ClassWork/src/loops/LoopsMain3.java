package loops;

public class LoopsMain3 {
    public static void main(String[] args) {

                System.out.println("Rirst :" + getFirstNumber(17, 28, 13));


        }

    public static int getFirstNumber (int from, int to, int number) {

                    int i = 17;
                    int result = -1;
                    while (i <= 100){
                        System.out.println("i=" + i);
                        if (i % 13 == 0 ){
                                  return i;
                        }
                        i++;
               }
                    return 0;
         }
    }



