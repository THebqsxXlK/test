package collections;

import java.util.*;

public class CollectionsMain2 {
    public static void main(String[] args) {
        List<Integer> container = new Vector<>();

        Random rnd = new Random();


        for (int i = 0; i < 10_000; i++) {
            container.add(rnd.nextInt());
        }

        long starTime = System.currentTimeMillis();
        for (int i = 0; i < container.size(); i++) {
            container.remove(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(starTime);
        System.out.println(stopTime);
        System.out.println(stopTime - starTime);
    }
}
