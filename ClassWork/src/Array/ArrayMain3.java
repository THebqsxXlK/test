package Array;

public class ArrayMain3 {

    public static void main(String[] args) {

        int [] container = new int [5];
        int[][] container2 = new int[5][8];
        int[][][] container3 = new int[5][8][5];


        int [] row = container2 [1];

        System.out.println(container2.length);
        System.out.println(row.length);
        container2[1][5] = 22;
        container3[1][5][3] = 69;

    }
}
