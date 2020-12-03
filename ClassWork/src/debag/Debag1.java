package debag;

public class Debag1 {
    public static void main(String[] args) {
        boolean isDebagMode = false;

        for (String arg : args){
            if("debug".equalsIgnoreCase(arg)){

            }
        }
        int a = 10;
        int b = 3;
        if(a + b > 10) {
            if (isDebagMode){

            }
            System.out.println("Мы попали тру");
            a = 5;
        }else {
            System.out.println("Мы попали фолс");
            a = 11;
        }
        System.out.println(a + b);
    }
}
