package LyamdaExpressionAndStreamApi.PartThreeTasks;

import java.util.Map;

/**
 * Given a Map<String><Integer>. Find the sum of all values of the length of keys that are less than 7 characters
 */

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> first = Map.of(
                "string1", 1,
                "strin2", 2,
                "string3", 3,
                "string4", 5,
                "strin5", 5
        );


        int sum = first.entrySet().stream().filter(entry -> entry.getKey().length() < 7).map(Map.Entry::getValue).mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }

}
