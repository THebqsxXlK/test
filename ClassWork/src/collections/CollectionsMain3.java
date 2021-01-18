package collections;

import collections.dto.ESex;
import collections.dto.Person;

import java.util.*;

public class CollectionsMain3 {
    public static void main(String[] args) {
        Set<Person> container = new HashSet<>();

        Random rnd = new Random();
        for (int i = 0; i < 10_000; i++) {
            ESex sex = rnd.nextBoolean() ? (rnd.nextBoolean() ? ESex.MAN : null) : ESex.WOMAN;
            Person p = new Person(String.valueOf(rnd.nextInt(100)), sex, rnd.nextInt(10));
            container.add(p);
        }

        int countMan = 0;
        int countWoman = 0;
        int countUnknown = 0;

        for (Person person : container) {
            if(ESex.MAN.equals(person.getSex())){
                countMan++;
            } else if(ESex.WOMAN.equals(person.getSex())){
                countWoman++;
            } else {
                countUnknown++;
            }
        }

        System.out.println(container);
        System.out.println(countMan);
        System.out.println(countWoman);
        System.out.println(countUnknown);

    }
}
