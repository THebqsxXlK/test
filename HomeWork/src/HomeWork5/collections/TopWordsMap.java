package HomeWork5.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWordsMap {
    public static void main(String[] args) throws FileNotFoundException {

        File book1 = new File("g:\\IT\\Java\\IdeaProjects\\Mk-JC1\\HomeWork\\src\\HomeWork5\\collections\\Война и мир_книга.txt");
        System.out.println(book1.exists());
        Scanner scanner = new Scanner(book1);
        int wordsCount = 0;
        String[] words = new String[0];
        Map<String, Integer> mapAllWords = new HashMap<>();
        List<String> listOfWords = new ArrayList<>();

        for (int j = 0; scanner.hasNextLine(); j++) {
            words = scanner.next().split("\"\\s(.*)\\s*|\\.|,|!|\\?|\"\"");
            listOfWords.addAll(Arrays.asList(words));
        }

        for (String key : listOfWords) {
            mapAllWords.putIfAbsent(key,
                    Collections.frequency(listOfWords, key));
        }

        ValueComparator bvc = new ValueComparator(mapAllWords);
        TreeMap<String, Integer> sorted_map = new TreeMap<>(bvc);
        sorted_map.putAll(mapAllWords);

        int count = 0;
        for (Map.Entry<String, Integer> pair : sorted_map.entrySet()) {
            System.out.print(pair.getKey() + " - " + pair.getValue() + " раз, ");
            count += 1;

            if (count == 10) {
                break;
            }
        }
    }
}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
