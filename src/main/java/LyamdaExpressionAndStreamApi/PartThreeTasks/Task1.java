package LyamdaExpressionAndStreamApi.PartThreeTasks;

import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Given a list of integers. Find the average of all odd numbers divisible by 5
 * Find the statistic too, count, sum, min, average and max
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 15, 20, 100, 200, 300, 400, 250);

        integerList.stream().filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .forEach(System.out::println);

        IntSummaryStatistics statistics = integerList
                .stream()
                .filter(value -> value % 2 != 0 && value % 5 == 0)
                .mapToInt(value -> value)
                .summaryStatistics();

        System.out.println(statistics);
    }
}
