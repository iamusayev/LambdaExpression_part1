package LyamdaExpressionAndStreamApi.PartThreeTasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, output a string representing the concatenation of the string representations of these
 * numbers Example: list {5,2,4,2,1}
 * Resulting string 52421
 */
public class Task4 {
    public static void main(String[] args) {


        List<Integer> integerList = List.of(5, 2, 4, 2, 1);


        //1st way
        integerList.stream().map(String::valueOf).reduce((string1, string2) -> string1 + string2 ).ifPresent(System.out::println);

        //2nd way
        String collect = integerList.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);


    }
}
