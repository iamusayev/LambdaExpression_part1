package LyamdaExpressionAndStreamApi.SecondTask;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2. Given a list of chats from the previous task, only instead of the field “number of users” there will be a list of objects
 *   * type User which has 3 fields: id (integer identifier), name and age.
 *   * <p>
 *   * Task:
 *   * - Convert the list of chats into one list of users of all chats who are over 18 years old
 *   * - Calculate the average age of all remaining users using stream api
 *   * - Calculate the count, sum, min, average and max (print statistic)
 *
 */
public class Main {

    public static void main(String[] args) {
        Stream<Chats> chatsStream = Stream.of(new Chats("first", new User(1, "Jim", 27)),
                new Chats("second", new User(2, "Antony", 30)),
                new Chats("third", new User(3, "Lucy", 33)),
                new Chats("fourth", new User(4, "Edward", 17)),
                new Chats("fifth", new User(5, "Sammy", 28)),
                new Chats("sixth", new User(6, "Emmy", 26)));


        List<Chats> adultUser = chatsStream.filter(user -> user.getUser().getAge() > 18).collect(Collectors.toList());


        double averageAge = adultUser.stream().mapToInt(user -> user.getUser().getAge()).summaryStatistics().getAverage();
        System.out.println("Average age is " + averageAge);
        var statistics = adultUser.stream().mapToInt(user -> user.getUser().getAge()).summaryStatistics();
        System.out.println(statistics);


    }
}