package HomeWork5.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) throws FileNotFoundException {

        File book1 = new File("g:\\IT\\Java\\Война и мир_книга.txt");
        System.out.println(book1.exists());
        Scanner scanner = new Scanner(book1);
        int wordsCount = 0;

        String[] arrayWords = new String[args.length];
        Set<String> setUnique = new HashSet<>();

        while (scanner.hasNextLine()) {

            arrayWords = scanner.next().split("\\s(.*)\\s*|\\.|,|!|\\?|\"");
            wordsCount += arrayWords.length;
            Collections.addAll(setUnique, arrayWords);
        }

        Set<String> setUnique1 = new HashSet<>();

        for (String str : setUnique) {
            if (str.matches("\\D.")) { //одну букву
                setUnique1.remove(str);
            }
            if (str.matches("\\d([0-9|-]*)")) { //отсеять цифры
                setUnique1.remove(str);
            }
            if (str.matches("\\d([0-9]*)-[а-я]*")) { //отсеять числительные с буквами
                setUnique1.remove(str);
            } else {
                setUnique1.add(str);
            }
        }
        scanner.close();
        //System.out.println("after fix: " + setUnique1);
        //System.out.println("Number of all words: " + wordsCount);
        System.out.printf("Set contains %d unique words \n", setUnique1.size());
    }
}