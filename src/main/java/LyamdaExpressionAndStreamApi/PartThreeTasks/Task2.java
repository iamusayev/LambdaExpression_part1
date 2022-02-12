package LyamdaExpressionAndStreamApi.PartThreeTasks;

import java.util.List;

/**
 * Given a list of strings. Find number of unique strings longer than 8 characters
 */

public class Task2 {
    public static void main(String[] args) {

        List<String> list = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-12",
                "string-12",
                "string-16");


        long count = list.stream()
                .filter(string -> string.length() > 8)
                .distinct()
                .count();

        System.out.println(count);

    }
}
