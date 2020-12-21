package strings;

public class Matches {
    public static void main(String[] args) {
        String str = "Test     string      for       split";

        System.out.println(str.replaceAll(" +", " "));
        System.out.println(str.replace("     ", " "));
    }
}
