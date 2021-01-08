package methods;

public class SumNums {

    static int a = 2;

    static void outNums(int... nums) {
        int result = 0;
        for (int n : nums)
            result += n;
        a = result;
        System.out.println(result);
    }



}