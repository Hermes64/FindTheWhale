package KEA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount {

    public static final int OCCURRENCES = 1000;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("H:/KEA/Downloads/whale2.txt"));
        Map<String, Integer> wordCountMap = getCountMap(scan);
        
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > OCCURRENCES) {
                System.out.println(word + " occurs   " + count + "   times.");
            }
        }
    }
        public static Map<String, Integer> getCountMap (Scanner scan){

            Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

            while (scan.hasNext()) {

                String word = scan.next().toLowerCase(Locale.ROOT);

                if (wordCountMap.containsKey(word)) {
                   int count = wordCountMap.get(word);
                   wordCountMap.put(word, count + 1);

                } else {
                    wordCountMap.put(word, 1);
                }
            }
                return wordCountMap;
            }
        }



